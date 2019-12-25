package com.marvel.mvcustomerfeign.controller;

import com.marvel.mvcustomerfeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author wupeng
 * @Date 2019-12-25 15:41
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return helloService.sayHello();
    }

}
