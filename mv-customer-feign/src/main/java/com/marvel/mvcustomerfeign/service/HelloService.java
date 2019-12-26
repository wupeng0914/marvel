package com.marvel.mvcustomerfeign.service;

import com.marvel.mvcustomerfeign.hystrix.HystrixForHello;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hello", fallback = HystrixForHello.class)
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello();

}
