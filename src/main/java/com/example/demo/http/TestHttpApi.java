package com.example.demo.http;

import com.example.demo.config.TestHttpConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

/**
 * @author: movie
 * @date: 2024/12/4 10:54
 */
@FeignClient(name = "httpbin", url = "https://httpbin.org", configuration = TestHttpConfig.class)
public interface TestHttpApi {
    @PostMapping(value = "/post", consumes = "application/json", produces = "application/json")
    String post(@RequestHeader("accept") String accept,
                @RequestBody(required = false) Map<String, Object> body);
}
