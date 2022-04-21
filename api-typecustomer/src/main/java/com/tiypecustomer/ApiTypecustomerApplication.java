package com.tiypecustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class ApiTypecustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiTypecustomerApplication.class, args);
	}

}
