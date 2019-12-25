package com.marvel.mvcustomerribbon.service;

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

    public String helloService(){
        return restTemplate.getForObject("http://SERVICE-HELLO/hello",String.class);
    }

}
