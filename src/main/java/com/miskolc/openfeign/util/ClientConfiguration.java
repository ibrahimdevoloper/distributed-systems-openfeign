package com.miskolc.openfeign.util;

import feign.okhttp.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class ClientConfiguration {
    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }

//    @Value("${pokemon-card-service.url}")
//    private String url;
//
//    @Bean
//    public String url() {
//        return url;
//    }
}
