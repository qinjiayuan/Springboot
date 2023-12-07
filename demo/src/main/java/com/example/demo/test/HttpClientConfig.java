package com.example.demo.test;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.http.client.HttpClient;

@Configuration
public class HttpClientConfig {
    @Bean
    public HttpClient httpClient() {
        return HttpClientBuilder.create().build();
    }
}