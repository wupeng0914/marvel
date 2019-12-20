package com.marvel.registercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MvRegisterCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvRegisterCenterApplication.class, args);
	}

}
