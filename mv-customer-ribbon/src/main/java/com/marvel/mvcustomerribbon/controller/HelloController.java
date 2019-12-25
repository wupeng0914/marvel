package com.marvel.mvcustomerribbon.controller;

import com.marvel.mvcustomerribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author wupeng
 * @Date 2019-12-24 18:12
 **/
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return helloService.helloService();
    }

}
