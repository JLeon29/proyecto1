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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<TypeCustomer> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	
}
