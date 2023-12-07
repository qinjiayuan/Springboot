package com.example.demo.test.http;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpUtils {

    static Logger Log = LoggerFactory.getLogger(HttpUtils.class);

    public static String postMap(String url, Map<String,String> params){
        Log.info("**********HTTP POST**********\n **********url**********\r{}\n **********params**********\r{}", url, params);
        String result = null;
        HttpClient httpClient = null;
        try{
            if(params!=null && params.size()>0) {
                httpClient = new DefaultHttpClient();
                HttpPost post = new HttpPost(url);
                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                for(Map.Entry<String,String> entry : params.entrySet()){
                    if(entry.getValue()!=null){
                        nameValuePairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue().trim()));
                    }
                }
                HttpEntity httpEntity = new UrlEncodedFormEntity(nameValuePairs,"UTF-8");
                post.setEntity(httpEntity);
                HttpResponse response = httpClient.execute(post);
                int code = response.getStatusLine().getStatusCode();


                HttpEntity entity = response.getEntity();
                if(entity != null) {
                    result = EntityUtils.toString(entity);
                }
                if(HttpStatus.SC_OK==code) {

                    Log.info("**********请求处理成功**********");
                }else {
                    Log.warn("**********请求处理失败**********");
                    String error = "服务器响应出错！";
                    if(result != null) {
                        JSONObject json = JSONObject.parseObject(result);
                        error = json.get("error").toString();
                        Log.warn("**********错误信息：{}**********",error);
                    }
//					throw new BusinessException(error)	;
                }
            }
            return result;
        }catch(Exception e) {
            Log.error("postJson error:{}", ExceptionUtils.getStackTrace(e));
        }finally {
            if(httpClient != null){
                httpClient.getConnectionManager().shutdown();
            }
        }
        return null;
    }

    public static String postWithFiles(String url, Map<String, String> headerMap, Map<String, String> params, Map<String, String> cnParams, String fileParam, List<MultipartFile> files) {


        if (fileParam==null||"".equals(fileParam)) {
            fileParam = "files";
        }
        Log.info("*****HTTP POST****\n url:[{}],headerParams:[{}], params:[{}]***,cnParams:[{}]", new Object[]{url, headerMap, params, cnParams});
        CloseableHttpClient httpClient = null;
        try {
            httpClient = HttpClients.createDefault();
            org.apache.http.client.methods.HttpPost post = new org.apache.http.client.methods.HttpPost(url);
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);// 兼容性模式

            if (null != headerMap && headerMap.size() > 0) {
                for(Map.Entry<String, String> entry : headerMap.entrySet()) {
                    post.addHeader(entry.getKey(), entry.getValue());
                }
            }
            if (null != params && params.size() > 0) {//组装参数
                for(Map.Entry<String, String> entry : params.entrySet()) {
                    builder.addTextBody(entry.getKey(), entry.getValue());
                }
            }
            // 解决中文参数乱码
            if (null != cnParams && cnParams.size() > 0) {
                for(Map.Entry<String, String> entry : cnParams.entrySet()) {
                    builder.addPart(entry.getKey(), new StringBody(entry.getValue(), ContentType.create("text/plain", Consts.UTF_8)));
                }
            }
            if (null != files) {
                for (int i = 0; i < files.size(); i++){

                    builder.addBinaryBody(fileParam, files.get(i).getInputStream(), ContentType.MULTIPART_FORM_DATA, files.get(i).getOriginalFilename());
                }
            }
            builder.setCharset(Charset.forName("UTF-8"));
            post.setEntity(builder.build());
            HttpResponse response = httpClient.execute(post);
            HttpEntity responseEntity = response.getEntity();
            if (null == responseEntity) {
                throw new RuntimeException("post方法返回结果对象为空");
            }
            String resp = EntityUtils.toString(responseEntity, Charset.forName("UTF-8"));
            if (StringUtils.isEmpty(resp)) {
                throw new RuntimeException("post方法返回结果对象为空");
            }
            return resp;
        }catch (RuntimeException e) {
            throw e;
        }catch (Exception e) {
            throw new RuntimeException("调用post方法发生异常:" + e);
        }finally {
            try {
                if (null != httpClient) {
                    httpClient.close();
                }
            }catch (IOException e) {
                throw new RuntimeException("[post]方法关闭HTTP资源失败！");
            }
        }
    }

    public static String postWithFiles(String url, Map<String, String> headerMap, Map<String, String> params, Map<String, String> cnParams, List<MultipartFile> files) {
        return postWithFiles(url, headerMap, params, cnParams, "files", files);
    }

    public static String get(String url, Map<String,String> params) {

        String responseMsg = "";

        org.apache.commons.httpclient.HttpClient httpClient = new org.apache.commons.httpclient.HttpClient();

        if(params!=null && params.size()>0) {
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            for(Map.Entry<String,String> entry : params.entrySet()){
                if(entry.getValue()!=null){
                    nameValuePairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue().trim()));
                }
            }
            url += "?";
            url += URLEncodedUtils.format(nameValuePairs, "UTF-8");
        }

        Log.info("请求报文:" + url);


        GetMethod getMethod = new GetMethod(url);

        try {
            int statusCode = httpClient.executeMethod(getMethod);// 发送请求
            if (statusCode == HttpStatus.SC_OK) {
                Log.info("请求成功！");
            }else{
                Log.info("请求失败！");
            }
            // 读取内容
            //byte[] responseBody = getMethod.getResponseBody();
            InputStream inputStream = getMethod.getResponseBodyAsStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
            StringBuffer stringBuffer = new StringBuffer();
            String str = "";
            while ((str = br.readLine()) != null) {
                stringBuffer.append(str);
            }
            // 处理返回的内容
            responseMsg = stringBuffer.toString();
        } catch (org.apache.commons.httpclient.HttpException e) {
            Log.error("HttpException occurred: {}", e);
        } catch (IOException e) {
            Log.error("IOException occurred: {}", e);
        } catch (Exception e){
            Log.error("execption occurred: {}", e);
        }finally {
            getMethod.releaseConnection();// 关闭连接
        }
        return responseMsg;
    }


}
