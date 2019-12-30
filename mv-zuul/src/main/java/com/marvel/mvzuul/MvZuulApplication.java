package com.marvel.mvzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MvZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvZuulApplication.class, args);
	}

}
