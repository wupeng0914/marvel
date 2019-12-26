package com.marvel.mvcustomerribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author wupeng
 * @Date 2019-12-24 18:13
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(){
        return restTemplate.getForObject("http://SERVICE-HELLO/hello",String.class);
    }

    public String helloError(){
        return "Sorry, Error !";
    }
}
