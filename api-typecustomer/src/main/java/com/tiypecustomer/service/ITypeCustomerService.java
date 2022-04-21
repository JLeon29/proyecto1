package com.tiypecustomer.service;

import com.tiypecustomer.model.TypeCustomer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITypeCustomerService {
	
	public Flux<TypeCustomer> findAll(); 

	public Mono<TypeCustomer> findById(Long id); 
	
	
	
	


}
