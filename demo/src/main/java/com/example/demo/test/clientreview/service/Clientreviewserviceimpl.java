package com.example.demo.test.clientreview.service;

import com.alibaba.fastjson.JSONArray;

import com.example.demo.test.http.HttpUtils;
import model.*;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sql.*;
import org.json.JSONObject;
import javax.annotation.Resource;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
//是Clientreviewservice的具体实现类
public class Clientreviewserviceimpl implements Clientreviewservice {

    private static Logger log = LoggerFactory.getLogger(Clientreviewserviceimpl.class);

    @Resource
    private OtcDerivativeCounterpartyMapper otcDerivativeCounterpartyMapper;

    @Resource
    private ClientReviewRecordMapper clientReviewRecordMapper;

    @Resource
    private AuserMapper auserMapper;

    @Resource
    private CounterpartyOrgMapper counterpartyOrgMapper;

    @Resource
    private CounterpartyBenefitOverListMapper counterpartyBenefitOverListMapper;

    @Resource
    private ClientReviewCounterpartyMapper clientReviewCounterpartyMapper;

    @Resource
    private ClientReviewDetailMapper clientReviewDetailMapper;

    @Resource
    private ClientReviewFileRecordMapper clientReviewFileRecordMapper;

    @Override
    public List<String> createFlow(String corporateName , String customermanager , String isnew) throws Exception {
        List<String> file_name = Arrays.asList("主体/管理人文件", "32", "CSRC", "QCC_CREDIT_RECORD", "CEIDN", "QCC_ARBITRATION", "QCC_AUDIT_INSTITUTION", "CCPAIMIS", "CC", "P2P", "OTHERS", "NECIPS", "CJO");
        try{
            log.info("corporateName:{},customermanager:{},isnew:{}",corporateName,customermanager,isnew);
            SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");
            Date datenow = new Date();
            String checkdate = today.format(datenow);
//            查询客户经理
            List<Auser> manager = new ArrayList<>();
            manager = auserMapper.selectExists(customermanager);
            if(null == manager || manager.isEmpty()){throw new Exception("客户经理不存在，请确认输入的客户经理的中文名称");}


//            处理存量回访流程
            List<ClientReviewRecord> flownum =  new ArrayList<>();
            flownum = clientReviewRecordMapper.selectflownum(corporateName);
            boolean deleteFlag = !flownum.isEmpty();
            if(deleteFlag){
                List<String> docids = flownum.stream().filter(record ->!"CLOSED".equals(record.getCurrentStatus())&&!"CANCELLED".equals(record.getCurrentStatus()))
                                             .map(ClientReviewRecord::getDocId)
                                             .collect(Collectors.toList());
                docids.stream().forEach(docid ->{
                    clientReviewRecordMapper.deleteflow(docid);
                });
            }

//            设置台账和机构中符合的起流程的条件
            CounterpartyOrg counterpartyOrg = new CounterpartyOrg();
            counterpartyOrg.setAmlMonitorFlag("true");
            counterpartyOrg.setCorporateName(corporateName);
            counterpartyOrgMapper.updateByPrimaryKeySelective(counterpartyOrg);

            OtcDerivativeCounterparty configuration = new OtcDerivativeCounterparty();
            configuration.setCorporateName(corporateName);
            configuration.setAmlMonitorFlag("true");
            configuration.setNoAutoVisit("false");
            configuration.setDeleteFlag("0");
            configuration.setAllowBusiType("TRS,OPTION,PRODUCT");
            configuration.setMasterAgreementDate(LocalDate.now());
            configuration.setReturnVisitDate(LocalDate.now());
            configuration.setCustomerManager(manager.get(0).getUserid());
            configuration.setIntroductionDepartment(manager.get(0).getDeptCode());
            otcDerivativeCounterpartyMapper.updateByCorporatename(configuration);

//            设置投资者明细
            List<OtcDerivativeCounterparty> prodclient = new ArrayList<>();
            prodclient = otcDerivativeCounterpartyMapper.selectAll(corporateName);
            if(prodclient.isEmpty()||prodclient==null)
            {throw new Exception("公司不存在");}
            List<String> prodId = prodclient.stream()
                    .filter(tmp ->"03".equals(tmp.getIsProdHolder()))
                    .map(OtcDerivativeCounterparty::getClientId)
                    .collect(Collectors.toList());
            if(prodId==null|| prodId.isEmpty()) {
                throw new IllegalArgumentException("不存在产品客户");
            }
            prodId.stream().forEach(clientId ->{

                List<CounterpartyBenefitOverList> num = new ArrayList<>();
                num = counterpartyBenefitOverListMapper.selectByClientId(clientId);

                CounterpartyBenefitOverList counterpartyBenefitOverList = new CounterpartyBenefitOverList();
                counterpartyBenefitOverList.setClientId(clientId);
                counterpartyBenefitOverList.setName("测试");
                counterpartyBenefitOverList.setIdNo("1928382942342");
                counterpartyBenefitOverList.setProfessionalInvestorFlag("1");
                counterpartyBenefitOverList.setInvest3yearExpFlag("1");
                counterpartyBenefitOverList.setFinancialAssetsOfLastyear((short) 123);
                counterpartyBenefitOverList.setAssets20millionFlag("1");
                if(num.isEmpty() || null == num){
                    counterpartyBenefitOverList.setIdNo(getid());
                    counterpartyBenefitOverListMapper.insertSelective(counterpartyBenefitOverList);

                }else{
                    counterpartyBenefitOverListMapper.updateByPrimaryKeySelective(counterpartyBenefitOverList);
                }

            });

//            查出统一信用代码
            String unifiledsocialcode = prodclient.get(0).getUnifiedsocialCode();
            String Env ="http://10.2.145.216:9090";

//            调用回访流程接口
            Map<String,String> datas = new HashMap<>();
            datas.put("checkDateEnd",checkdate);
            datas.put("checkDateStart",checkdate);
            datas.put("uniCodeList",unifiledsocialcode);

//            根据产品数量来判断是否需要走多产品接口
            if(1<prodId.size()){
                String url1 = Env + "/clientreview/checkMultipleClient";
                String result1 = HttpUtils.postMap(url1,datas);
                log.info(result1);

            }

//            生成机构客户或者单产品客户回访流程
            String url1 = Env + "/clientreview/checkSingleClient";
//            postmap方法中是Map<String,String> 所以入参也要是同样的类型
            String result = HttpUtils.postMap(url1, datas);
            log.info(result);

//            查出发起流程的数据
            List<ClientReviewRecord> recordIdList = new ArrayList<>();
            recordIdList = clientReviewRecordMapper.selectflownum(corporateName);
            recordIdList.forEach(recordId -> {
                ClientReviewDetail clientReviewDetail = new ClientReviewDetail();
                clientReviewDetail.setId(getid());
                clientReviewDetail.setRecordId(recordId.getRecordId());
                clientReviewDetail.setClientName("11");
                clientReviewDetail.setClientPosition("老师");
                clientReviewDetail.setEmail("123@qq.com");
                clientReviewDetail.setPhone("13112345678");
                clientReviewDetail.setReviewLog("123");
                clientReviewDetail.setSuitability("N");
                clientReviewDetail.setSuitabilityLog("123");
                clientReviewDetail.setCreatedDatetime(datenow);
                clientReviewDetailMapper.insertSelective(clientReviewDetail);

                ClientReviewCounterparty clientReviewCounterparty = new ClientReviewCounterparty();
                clientReviewCounterparty.setAgreeInfo("Y");
                clientReviewCounterparty.setBenefitOverFlag("1");
                clientReviewCounterparty.setRecordId(recordId.getRecordId());
                clientReviewCounterpartyMapper.updatebyrecordId(clientReviewCounterparty);

                ClientReviewRecord updateinfo = new ClientReviewRecord();
//               isnew=1 ->新流程
                updateinfo.setVersion("1".equals(isnew) ? "202210" : null);
                updateinfo.setAccountingFirmName("测试专用");
                updateinfo.setSalePerson("renyu");
                updateinfo.setRecordId(recordId.getRecordId());
                clientReviewRecordMapper.updatebyrecordId(updateinfo);
                List <String> s3FileId = gets3filed();

                ClientReviewFileRecord clientReviewFileRecord = new ClientReviewFileRecord();
                for(int i =0;i < s3FileId.size();i++){
                    clientReviewFileRecord.setRecordId(recordId.getRecordId());
                    clientReviewFileRecord.setS3FileId(s3FileId.get(i));
                    clientReviewFileRecord.setFileBelong(file_name.get(i));
                    clientReviewFileRecordMapper.updateByPrimaryKeySelective(clientReviewFileRecord);
                }

            });

//            查询标题并且返回
            List<ClientReviewRecord> flowList = new ArrayList<>();
            flowList = clientReviewRecordMapper.selectflownum(corporateName);
            List<String> titleList = flowList.stream().map(ClientReviewRecord::getTitle).collect(Collectors.toList());
            log.info(titleList.toString());
            return titleList;

        }


        catch(Exception e){
            log.info(e.toString());
            throw e;
        }
    }

    public  String getid() {
        // 定义生成的字符串长度
        int length = 32;

        // 创建一个随机数生成器
        Random random = new Random();

        // 创建一个StringBuilder对象，用于构建字符串
        StringBuilder sb = new StringBuilder();

        // 循环生成字符串
        for (int i = 0; i < length; i++) {
            // 生成一个随机数
            int num = random.nextInt(2);
            // 根据随机数生成字符
            if (num == 0) {
                // 生成大写字母
                sb.append(Character.toUpperCase((char) (random.nextInt(26) + 65)));

            } else {
                // 生成数字
                sb.append(random.nextInt(10));
            }
        }

        // 输出生成的字符串
        return sb.toString();
    }

    public  List<String> gets3filed() {



        String url = "http://10.2.145.216:9090/clientreview/file/upload";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        List<String> s3id = new ArrayList<>();
        try{

            HttpPost httpPost = new HttpPost(url);
            File file = new File("src/main/java/com/example/demo/test/clientreview/O)V3LMKPINYJ]ZYS@GV_$W6.png");
            log.info("file :"+file.getName());
            if(!file.exists()){
                log.info("File is no exists");
            }else{
                log.info("File is exisits");
            }
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("fileBelong","主体/管理人文件"));
            nameValuePairs.add(new BasicNameValuePair("productName","主体/管理人文件"));

            MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();
            multipartEntityBuilder.setCharset(Consts.UTF_8);
            for(NameValuePair nameValuePair:nameValuePairs){
                multipartEntityBuilder.addTextBody(nameValuePair.getName(),nameValuePair.getValue(), ContentType.create("text/plain", Consts.UTF_8));
            }
            for(int i = 0; i < 13 ; i++) {
                multipartEntityBuilder.addBinaryBody("files", Files.newInputStream(file.toPath()), ContentType.MULTIPART_FORM_DATA, file.getName());
            }
            httpPost.setHeader("name","sunbin");
            HttpEntity httpEntity = multipartEntityBuilder.build();
            httpPost.setEntity(httpEntity);

            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            String msg1 = EntityUtils
                    .toString(response.getEntity());
            log.info(msg1);

            JSONObject jsonObject = new JSONObject(msg1);
            String content = String.valueOf(jsonObject.getJSONArray("data"));
            //该方法是将一个字符串转换成一个json数组对象
            JSONArray arr = JSONArray.parseArray(content);


            for(int i = 0 ; i< arr.size();i++){
                com.alibaba.fastjson.JSONObject obj = arr.getJSONObject(i);
                String s3fileid = obj.getString("s3FileId");
                s3id.add(s3fileid);
            }
            log.info(s3id.toString());
            return s3id;


        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            if(httpClient !=null){
                httpClient.getConnectionManager().shutdown();
            }

        }
    }


}
