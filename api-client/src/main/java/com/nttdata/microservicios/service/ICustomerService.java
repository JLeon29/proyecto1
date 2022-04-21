package com.nttdata.microservicios.service;

import com.nttdata.microservicios.model.Client;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICustomerService {
	
	public Flux<Client> findAll(); 

	public Mono<Client> findById(Long id); 
	
	public Mono<Client> save(Client customer);
	
	public Mono<Void> delete(Client customer);
	
	public Mono<Client> update(Client customer);
	
	

}
