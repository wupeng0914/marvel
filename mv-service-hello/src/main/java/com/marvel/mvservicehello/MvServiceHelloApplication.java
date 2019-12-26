package com.marvel.mvservicehello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
public class MvServiceHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvServiceHelloApplication.class, args);
	}

}
