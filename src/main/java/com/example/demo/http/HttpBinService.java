package com.example.demo.http;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: movie
 * @date: 2024/12/4 11:04
 */
@Service
public class HttpBinService {
    @Resource
    private  TestHttpApi httpBinClient;

    public String sendPostRequest() {
        // 设置请求头中的accept参数
        String accept = "application/json";

        // 如果有请求体，则构建请求体
        Map<String, Object> requestBody = new HashMap<>();
        // 例如可以添加一些键值对到requestBody中
        // requestBody.put("key", "value");

        // 发送POST请求
        return httpBinClient.post(accept, requestBody);
    }
}
