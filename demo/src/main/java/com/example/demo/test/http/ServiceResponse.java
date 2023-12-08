package com.example.demo.test.http;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ServiceResponse<T> {

    private final static Set<String> EXCLUDE = new HashSet<>();
    static {
        EXCLUDE.add("serviceId");
        EXCLUDE.add("errCode");
        EXCLUDE.add("errMsg");
        EXCLUDE.add("data");
    }

    @ApiModelProperty(value = "服务ID，可在调用发生异常时查询信息")
    private String serviceId;

    @ApiModelProperty(value = "响应状态码，请求正常通常返回200（默认），或者为了兼容就接口返回0也表示正常")
    private StatusCodeEnum errCode;

    @ApiModelProperty(name = "errMsg", value = "异常描述", example = "请求参数错误", dataType = "string", required = false)
    private String errMsg;

    @ApiModelProperty(value = "返回数据")
    //@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
    private T data;

    @ApiModelProperty(value = "属性对象，转成JSON时会将map中的属性拆开到外层，并且map中不能放入key为：serviceId、errCode、data的key")
    private final Map<Object, Object> map = new HashMap<>();

    public ServiceResponse() {
        this.serviceId = getTraceId();
    }

    public ServiceResponse(StatusCodeEnum errCode, String errMsg) {
        this.serviceId = getTraceId();
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    /**
     * 创建成功的响应
     *
     * @param data 响应的数据
     */
    public ServiceResponse(String serviceId, T data) {
        this(serviceId, StatusCodeEnum.SUCCESS, data);
    }

    /**
     * 创建成功的响应
     */
    public ServiceResponse(String serviceId) {
        this(serviceId, StatusCodeEnum.SUCCESS, null);
    }

    public ServiceResponse(String serviceId, StatusCodeEnum errCode, T data) {
        this.serviceId = serviceId;
        this.errCode = errCode;
        this.data = data;
    }

    public ServiceResponse(T data) {
        this.serviceId = getTraceId();
        this.errCode =  StatusCodeEnum.SUCCESS;
        this.data = data;
    }

    public ServiceResponse(StatusCodeEnum errCode, T data) {
        this.serviceId = getTraceId();
        this.errCode = errCode;
        this.data = data;
    }

    /**
     * 错误返回
     *
     * @param errCode 错误码
     * @param errMsg  错误信息
     * @return
     */
    public static <T> ServiceResponse<T> fail(StatusCodeEnum errCode, String errMsg) {
        return new ServiceResponse<>(errCode, errMsg);
    }

    public static <T> ServiceResponse<T> fail(StatusCodeEnum errCode){
        return new ServiceResponse<>(errCode, errCode.getChs());
    }

    /**
     * 错误返回
     *
     * @param errMsg 错误信息
     * @return
     */
    public static <T> ServiceResponse<T> fail(String errMsg) {
        return new ServiceResponse<>(StatusCodeEnum.INTERNAL_SERVER_ERROR, errMsg);
    }



    /**
     * 成功返回
     *
     * @param errCode  返回状态
     * @param data 数据列表
     * @param <T>  返回数据类型
     * @return
     */
    public static <T> ServiceResponse<T> success(StatusCodeEnum errCode, T data) {
        return new ServiceResponse<T>(errCode, data);
    }

    /**
     * 失败返回
     *
     * @param errCode  返回状态
     * @param data 数据列表
     * @param <T>  返回数据类型
     * @return
     */
    public static <T> ServiceResponse<T> fail(StatusCodeEnum errCode, T data) {
        return new ServiceResponse<T>(errCode, data);
    }

    /**
     * 成功返回
     *
     * @param msg  返回信息
     * @param data 数据列表
     * @param <T>  返回数据类型
     * @return
     */
    public static <T> ServiceResponse<T> success(String msg, T data) {
        return new ServiceResponse<T>(msg, data);
    }

    /**
     * 成功返回
     *
     * @param data 数据列表
     * @param <T>  返回数据类型
     * @return
     */
    public static <T> ServiceResponse<T> success(T data) {
        return new ServiceResponse<T>(data);
    }

    public StatusCodeEnum getErrCode() {
        return errCode;
    }

    public void setErrCode(StatusCodeEnum errCode) {
        this.errCode = errCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * 从MDC中获取traceId, 获取不则用uuid兜底
     * @return
     */
    public static String getTraceId() {
        String traceId = MDC.get("traceId");
        if (StringUtils.isNotEmpty(traceId)) {
            return traceId;
        } else {
            return UUIDUtils.id();
        }
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @JsonAnySetter
    public Object put(Object key, Object value) {


        if (key != null) {
            if (EXCLUDE.contains(key.toString())) {
                throw new RuntimeException(String.format(
                        "can not put [key=%s, value=%s], because key.toString() in %s",
                        key, value, EXCLUDE));
            }

            try {
                if (EXCLUDE.contains(JsonUtils.serialize(key))) {
                    throw new RuntimeException(String.format(
                            "can not put [key=%s, value=%s], com.fasterxml.jackson.databind.ObjectMapper.writeValueAsString(key) in %s",
                            key, value, EXCLUDE));
                }
            } catch (JsonProcessingException e) {
                // nothing need to do
            }
        }

        return map.put(key, value);
    }

    @JsonAnyGetter
    public Map<Object, Object> getMap() {
        return map;
    }
}