package com.marvel.mvcustomerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hello")
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello();

}