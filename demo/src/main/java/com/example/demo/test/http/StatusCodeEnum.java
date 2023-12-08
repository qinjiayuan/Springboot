package com.example.demo.test.http;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;

import javax.net.ssl.SSLException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@ApiModel(value = "状态码对象模型", description = "200:成功\r\n500:服务器内部错误\r\n400:失败\r\n408:请求超时\r\n412:条件检查失败\r\n501:未实现功能\r\n600xxx：异常错误码")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum StatusCodeEnum implements Serializable {

    // 成功，默认值
    SUCCESS(200, "成功", "success"),

    // 服务器内部错误
    INTERNAL_SERVER_ERROR(500, "服务器内部错误", "internal_server_error"),

    // 失败
    FAILURE(400, "失败", "failure"),

    // 失败
    FORBIDDEN(403, "禁止", "forbidden"),


    UNAUTHORIZED(401,"未授权","unauthorized" ),

    // 请求超时
    REQUEST_TIMEOUT(408, "请求超时", "request_timeout"),

    // 条件检查失败
    PRECONDITION_FAILED(412, "条件检查失败", "precondition_failed"),

    // 功能未实现
    NOT_IMPLEMENTED(501, "未实现功能", "not_implemented"),

    // 已接受，但尚未处理
    ACCEPTED(202, "已接受，但尚未处理", "accepted"),

    //业务状态码
    NOT_APPLICABLE_TASK(5001,"没有需要检查的任务","not_applicable_task"),

    //业务状态码
    NOT_TRADE_DATE(5002,"不是交易日","not_trade_date"),

    //业务状态码
    TASK_IS_CHECKING(5003,"跑批检查正在运行","task_is_checking"),

    DB_EEROR(50004, "数据库处理异常", "db_error"),

    //内部异常状态码
    EXCEPTION_GENERAL(600100,"通用异常", "Exception", Exception.class),



    EXCEPTION_CLASSNOTFOUND(600102,"未找到相应的类","ClassNotFoundException",ClassNotFoundException.class),

    EXCEPTION_ARITHMETIC(600103,"算术异常","ArithmeticException",ArithmeticException.class),

    EXCEPTION_ARRAYINDEXOUTOFBOUNDS(600104,"数组下标越界异常","ArrayIndexOutOfBoundsException",ArrayIndexOutOfBoundsException.class),

    EXCEPTION_ARRAYSTORE(600105,"数组中包含不兼容的值而抛出异常","ArrayStoreException",ArrayStoreException.class),

    EXCEPTION_SQL(600106,"操作数据库异常","SQLException", SQLException.class),

    EXCEPTION_SQLSYNTAXERROR(600107,"数据库标识符异常","SQLSyntaxErrorException", SQLSyntaxErrorException.class),

    EXCEPTION_NOSUCHFIELD(600108,"字段未找到异常","NoSuchFieldException",NoSuchFieldException.class),

    EXCEPTION_SECURITY(600109,"违背安全原则异常","SecurityException",SecurityException.class),

    EXCEPTION_EOF(600110,"文件已结束异常","EOFException",EOFException.class),

    EXCEPTION_FILENOTFOUND(600111,"文件未找到异常","FileNotFoundException",FileNotFoundException.class),

    EXCEPTION_NUMBERFORMAT(600112,"字符串转换为数字异常","NumberFormatException",NumberFormatException.class),

    EXCEPTION_IO(600113, "输入输出异常","IOException", IOException.class),

    EXCEPTION_ILLEGALARGUMENT(600114,"非法参数异常","IllegalArgumentException",IllegalArgumentException.class),

    EXCEPTION_NULLPOINTER(600115,"空指针异常","NullPointerException",NullPointerException.class),

    EXCEPTION_NOSUCHMETHOD(600116,"方法未找到异常","NoSuchMethodException",NoSuchMethodException.class),

    EXCEPTION_INDEXOUTOFBOUNDS(600117,"下标越界异常","IndexOutOfBoundsException",IndexOutOfBoundsException.class),

    EXCEPTION_ILLEGALSTATE(600118,"请求状态异常","IllegalStateException",IllegalStateException.class),

    EXCEPTION_SSL(600119, "证书不匹配","SSLException",SSLException.class),



    EXCEPTION_CLASSCAST(600121,"类型转换异常","ClassCastException",ClassCastException.class),
    EXCEPTION_FILESIZEEXCEEDED(600122,"文件大小超出限制异常","FileSizeLimitExceededException",ClassCastException.class)
    ;

    private final static Map<Integer, StatusCodeEnum> VALUE_MAP = new HashMap<>();

    private final static Map<Class<? extends Throwable>, StatusCodeEnum> EXCEPTION_MAP = new HashMap<>();
    static {
        for (StatusCodeEnum e : StatusCodeEnum.values()) {
            VALUE_MAP.put(e.getCode(), e);
            if(e.getExceptionClass() != null){
                EXCEPTION_MAP.put(e.getExceptionClass(),e);
            }
        }
    }

    @ApiModelProperty(name = "code", value = "状态码", example = "200", dataType = "integer", required = true)
    private final int code;
    @ApiModelProperty(name = "chs", value = "状态码中文信息", example = "成功", dataType = "string", required = true)
    private final String chs;
    @ApiModelProperty(name = "eng", value = "状态码英文信息", example = "success", dataType = "string", required = true)
    private final String eng;
    @ApiModelProperty(name = "exceptionClass", value = "对应异常class", example = "exception.class", dataType = "class")
    private Class<? extends Throwable> exceptionClass;

    StatusCodeEnum(int code, String chs, String eng) {
        this.code = code;
        this.chs = chs;
        this.eng = eng;
    }

    StatusCodeEnum(int code, String chs, String eng, Class<? extends Throwable> exceptionClass) {
        this.code = code;
        this.chs = chs;
        this.eng = eng;
        this.exceptionClass = exceptionClass;
    }

    public int getCode() {
        return code;
    }

    public String getChs() {
        return chs;
    }

    public String getEng() {
        return eng;
    }

    public Class<? extends Throwable> getExceptionClass() {
        return exceptionClass;
    }

    public static StatusCodeEnum valueOf(int code) {
        return VALUE_MAP.get(code);
    }

    public static StatusCodeEnum valueOf(Class<? extends Throwable> clazz) {
        return EXCEPTION_MAP.get(clazz);
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    @JsonCreator
    public static StatusCodeEnum getItem(@JsonProperty("code") int code){
        for(StatusCodeEnum item : values()){
            if(item.getCode() == code){
                return item;
            }
        }
        return null;
    }

}
