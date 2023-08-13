package com.example.secondmicroservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("http://first-microservice")
public interface FirstMicroserivceClient {
    @GetMapping("/first/message")
    String getData();

}
