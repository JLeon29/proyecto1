package com.tiypecustomer.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tiypecustomer.feignclient.TypeCustomerFeignClient;
import com.tiypecustomer.model.TypeCustomer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class TypeCustomerFeignClientService implements ITypeCustomerService {
	
	
	@Autowired
	private TypeCustomerFeignClient client;

	@Override
	public Flux<TypeCustomer> findAll() {
		return client.findAll().toStream().map(c -> new TypeCustomer(c,""));
	}

	@Override
	public Mono<TypeCustomer> findById(Long id) {
		return null;
	}

}
