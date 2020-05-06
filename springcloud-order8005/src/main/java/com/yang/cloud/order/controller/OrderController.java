package com.yang.cloud.order.controller;


import com.alibaba.fastjson.JSON;
import com.yang.cloud.order.entity.Advertisement;
import com.yang.cloud.order.service.AdvertService;
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
    @Autowired
    private AdvertService advertService;

    @GetMapping("/get")
    public String get() {
        String forObject = restTemplate.getForObject(url+"/payment/get", String.class);
        return "consumer:"+forObject;
    }

    @GetMapping("/get1")
    public String get1() {
        Advertisement byId = advertService.getById(123L);
        return "consumer:" + JSON.toJSONString(byId);
    }
}
