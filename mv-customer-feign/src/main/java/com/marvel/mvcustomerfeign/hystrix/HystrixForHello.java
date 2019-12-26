package com.marvel.mvcustomerfeign.hystrix;

import com.marvel.mvcustomerfeign.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author wupeng
 * @Date 2019-12-26 11:32
 **/
@Component
public class HystrixForHello implements HelloService {
    @Override
    public String sayHello() {
        // Do SomeThing
        return "Sorry, Error !";
    }
}
