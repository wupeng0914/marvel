package com.marvel.mvcustomerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // 开启Feign 功能
@EnableHystrixDashboard
public class MvCustomerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvCustomerFeignApplication.class, args);
    }

}
