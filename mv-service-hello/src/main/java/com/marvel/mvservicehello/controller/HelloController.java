package com.marvel.mvservicehello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author wupeng
 * @Date 2019-12-25 20:18
 **/
@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String home() {
        return "Hello world,from " + port;
    }
}
