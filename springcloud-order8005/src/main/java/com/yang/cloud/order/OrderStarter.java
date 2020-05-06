package com.yang.cloud.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yhy
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.yang.cloud.order.dao"})
public class OrderStarter {

    public static void main(String[] args) {
        SpringApplication.run(OrderStarter.class, args);
    }
}
