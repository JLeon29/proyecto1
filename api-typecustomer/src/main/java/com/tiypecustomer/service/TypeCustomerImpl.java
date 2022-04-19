package com.tiypecustomer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiypecustomer.model.TypeCustomer;
import com.tiypecustomer.repository.TypeCustomerRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TypeCustomerImpl implements ITypeCustomerService {
	
	@Autowired
	private TypeCustomerRepository repository;

	@Override
	public Flux<TypeCustomer> findAll() {
		return repository.findAll();
	}

	@Override
	public Mono<TypeCustomer> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Mono<TypeCustomer> save(TypeCustomer typeCustomer) {
		return repository.save(typeCustomer);
	}

	@Override
	public Mono<Void> delete(TypeCustomer typeCustomer) {
		return repository.delete(typeCustomer);
	}

	@Override
	public Mono<TypeCustomer> update(TypeCustomer typeCustomer) {		
		return repository.save(typeCustomer);
	}

	@Override
	public Flux<TypeCustomer> findByCustomerId(Long customerId) {
		
		return repository.findByCustomer(customerId);
	}

	
}
