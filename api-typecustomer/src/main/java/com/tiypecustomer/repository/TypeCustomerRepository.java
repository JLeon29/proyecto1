package com.tiypecustomer.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.tiypecustomer.model.TypeCustomer;

import reactor.core.publisher.Flux;

@Repository
public interface TypeCustomerRepository extends ReactiveMongoRepository<TypeCustomer, Long> {
	
	Flux<TypeCustomer>  findByCustomer (Long customerId);

}
