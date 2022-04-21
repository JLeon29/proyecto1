package com.tiypecustomer.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.tiypecustomer.model.TypeCustomer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface TypeCustomerRepository extends ReactiveMongoRepository<TypeCustomer, Long> {
	
	public Mono<TypeCustomer>  findByDni (String dniCustomer);

}
