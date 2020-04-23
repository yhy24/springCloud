package com.yang.cloud.order.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yhy
 */
@RestController
public class OrderController {

    private String url = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public String get() {
        String forObject = restTemplate.getForObject(url+"/payment/get", String.class);
        return "consumer:"+forObject;
    }
}
