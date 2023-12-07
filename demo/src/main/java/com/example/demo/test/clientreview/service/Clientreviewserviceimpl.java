package com.example.demo.test.clientreview.service;

import com.example.demo.test.http.HttpUtils;
import model.ClientReviewRecord;
import model.CounterpartyBenefitOverList;
import model.CounterpartyOrg;
import model.OtcDerivativeCounterparty;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sql.ClientReviewRecordMapper;
import sql.CounterpartyBenefitOverListMapper;
import sql.CounterpartyOrgMapper;
import sql.OtcDerivativeCounterpartyMapper;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
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

    @Autowired
    private OtcDerivativeCounterparty otcDerivativeCounterparty;

    @Autowired
    private ClientReviewRecord clientReviewRecord;

    @Resource
    private ClientReviewRecordMapper clientReviewRecordMapper;

    @Autowired
    private CounterpartyOrg counterpartyOrg;

    @Resource
    private CounterpartyOrgMapper counterpartyOrgMapper;

    @Autowired
    private HttpClient httpClient;

    @Resource
    private CounterpartyBenefitOverListMapper counterpartyBenefitOverListMapper;

    @Override
    public void createFlow(String corporateName , String customermanager , String isnew){
        try{
            log.info("corporateName:{},customermanager:{},isnew:{}",corporateName,customermanager,isnew);
            SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String checkdate = today.format(date);
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
            counterpartyOrgMapper.updateByPrimaryKeySelective(counterpartyOrg);

            OtcDerivativeCounterparty configuration = new OtcDerivativeCounterparty();
            configuration.setCorporateName(corporateName);
            configuration.setAmlMonitorFlag("true");
            configuration.setNoAutoVisit("false");
            configuration.setDeleteFlag("0");
            configuration.setAllowBusiType("TRS,OPTION,PRODUCT");
            configuration.setMasterAgreementDate(LocalDate.now());
            configuration.setReturnVisitDate(LocalDate.now());
            otcDerivativeCounterpartyMapper.updateByCorporatename(configuration);

//            设置投资者明细
            List<OtcDerivativeCounterparty> prodclient = new ArrayList<>();
            prodclient = otcDerivativeCounterpartyMapper.selectAll(corporateName);
            if(prodclient.isEmpty()||prodclient==null)
            {throw new RuntimeException("该公司不存在");}
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
                String url = Env + "/clientreview/checkMultipleClient";
                HttpPost httpPost = new HttpPost(url);

            }

//            生成机构客户或者单产品客户回访流程
            String url1 = Env + "/clientreview/checkSingleClient";
//            postmap方法中是Map<String,String> 所以入参也要是同样的类型
            String result = HttpUtils.postMap(url1, datas);






        }
        catch(Exception e){
            log.info(e.toString());
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




}
