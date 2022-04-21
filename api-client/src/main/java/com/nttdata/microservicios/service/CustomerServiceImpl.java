package com.nttdata.microservicios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.microservicios.model.Client;

import com.nttdata.microservicios.repository.ClienteRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ClienteRepository repository;
	


	@Override
	public Flux<Client> findAll() {
		
		return repository.findAll();
	
	}

	@Override
	public Mono<Client> findById(Long id) {
		
		return repository.findById(id);
	}

	@Override
	public Mono<Client> save(Client customer) {
	
		return repository.save(customer);
	}

	@Override
	public Mono<Void> delete(Client customer) {
		
		return repository.delete(customer);
	}

	@Override
	public Mono<Client> update(Client customer) {
		
		return repository.save(customer);
	}

	
}
