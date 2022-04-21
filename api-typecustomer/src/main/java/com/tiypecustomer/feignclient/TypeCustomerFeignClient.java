package com.tiypecustomer.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tiypecustomer.model.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@FeignClient(name = "customer-service", url = "localhost:9001")
public interface TypeCustomerFeignClient {
	
	@GetMapping("/findAll")
	public Flux<Customer> findAll();
	
	@GetMapping("/get/{id}")
	public Mono<Customer> findByIdCustomer (@PathVariable Long id);

}
