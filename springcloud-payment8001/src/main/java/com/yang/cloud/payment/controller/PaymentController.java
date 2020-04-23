package com.yang.cloud.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yhy
 */
@RestController
public class PaymentController {


    @GetMapping("/get")
    public String get() {
        return "SUCCESS";
    }
}
