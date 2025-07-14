package com.example.demo.config;

import com.example.demo.intercept.TestHttpIntercept;
import com.example.demo.intercept.TestHttpIntercept2;
import feign.RequestInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * @author: movie
 * @date: 2024/12/4 10:55
 */
public class TestHttpConfig {
    @Bean
    @ConditionalOnProperty(
            value = "cctv.interceptor.enabled",
            havingValue = "true",
            matchIfMissing = true
    )
    public RequestInterceptor cctvInterceptor() {
        return new TestHttpIntercept();
    }

    @Bean
    @ConditionalOnProperty(
            value = "cctv.video.interceptor.enabled",
            havingValue = "true",
            matchIfMissing = true
    )
    public RequestInterceptor cctvVideoRequestIntercept() {
        return new TestHttpIntercept2();
    }
}