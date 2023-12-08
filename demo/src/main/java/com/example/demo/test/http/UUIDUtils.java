package com.example.demo.test.http;

import java.util.UUID;

public class UUIDUtils {

    /**
     * 返回uuid
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * 返回去掉-的uuid
     * @return
     */
    public static String id() {
        return uuid().replaceAll("-","").toUpperCase();
    }
}
