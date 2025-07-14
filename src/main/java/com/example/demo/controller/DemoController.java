package com.example.demo.controller;

import com.example.demo.http.HttpBinService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: movie
 * @date: 2024/12/4 11:05
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    @Resource
    private HttpBinService httpBinService;

    @GetMapping("test")
    public void test() {
        httpBinService.sendPostRequest();
    }
}
