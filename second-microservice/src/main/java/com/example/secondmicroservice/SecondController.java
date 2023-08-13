package com.example.secondmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {
    private final FirstMicroserivceClient firstMicroserivceClient ;

    @Autowired
    public SecondController(FirstMicroserivceClient firstMicroserivceClient) {
        this.firstMicroserivceClient = firstMicroserivceClient;
    }


    @GetMapping("/message")
    public String test(){
        String result = firstMicroserivceClient.getData();
        return "the content of first microservice: "+result;
    }

}
