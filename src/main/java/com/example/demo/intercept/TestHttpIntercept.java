package com.example.demo.intercept;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @author: movie
 * @date: 2024/12/4 10:56
 */
public class TestHttpIntercept implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        System.out.println("intercept 1");
    }
}
