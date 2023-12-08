package com.example.demo.test.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Objects;

public class JsonUtils {
    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    public static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static <T> String serialize(T obj) throws JsonProcessingException {
        return mapper.writerFor(obj.getClass()).writeValueAsString(obj);
    }

    public static <T> T deserialize(String json, Class<T> clazz) throws IOException {
        return mapper.readerFor(clazz).readValue(json);
    }

    public static <T> T tryDeserialize(String json, TypeReference<T> valueTypeRef){
        try {
            return mapper.readerFor(valueTypeRef).readValue(json);
        } catch (Throwable e) {
            logger.error("tryDeserialize error!", e);
            return null;
        }
    }

    public static <T> T tryDeserialize(String json, Class<T> clazz){
        try {
            return mapper.readerFor(clazz).readValue(json);
        } catch (Throwable e) {
            logger.error("tryDeserialize error!", e);
            return null;
        }
    }

    public static <T> String serializeAsPretty(T obj) throws JsonProcessingException {
        return mapper.writerFor(obj.getClass()).withDefaultPrettyPrinter().writeValueAsString(obj);
    }

    public static <T> String trySerialize(T obj) {
        if (Objects.isNull(obj)) return Strings.EMPTY;
        try {
            return mapper.writerFor(obj.getClass()).writeValueAsString(obj);
        } catch (Throwable e) {
            logger.error("trySerialize error", e);
            return null;
        }
    }

    public static <T> String trySerializeAsPretty(T obj) {
        if (Objects.isNull(obj)) return Strings.EMPTY;
        try {
            return mapper.writerFor(obj.getClass()).withDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (Throwable e) {
            logger.error("trySerializeAsPretty error", e);
            return null;
        }
    }

}
