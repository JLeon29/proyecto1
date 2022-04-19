package com.tiypecustomer.service;

import com.tiypecustomer.model.TypeCustomer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITypeCustomerService {
	
	public Flux<TypeCustomer> findAll(); 

	public Mono<TypeCustomer> findById(Long id); 
	
	public Mono<TypeCustomer> save(TypeCustomer typeCustomer);
	
	public Mono<Void> delete(TypeCustomer typeCustomer);
	
	public Mono<TypeCustomer> update(TypeCustomer typeCustomer);
	
	public Flux<TypeCustomer> findByCustomerId (Long customerId);

}