package com.nttdata.microservicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.microservicios.model.Client;
import com.nttdata.microservicios.service.ICustomerService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private ICustomerService service;
	
	@PostMapping("/save")
	public ResponseEntity<Mono<Client>> saveCustomer(@RequestBody Client customer){
		return new ResponseEntity<Mono<Client>>(service.save(customer), HttpStatus.CREATED);
				
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<Flux<Client>> findAllCustomer(){

		
		return new ResponseEntity<Flux<Client>>(service.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Mono<Client>> findByIdCustomer(@PathVariable Long id){
		Mono<Client> customer= service.findById(id);
		return new ResponseEntity<Mono<Client>>(customer,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Mono<Void>> deleteCustomer(@RequestBody Client customer){
		return new ResponseEntity<Mono<Void>>(service.delete(customer), HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Mono<Client>> updateCustomer(@RequestBody Client customer){
		return new ResponseEntity<Mono<Client>>(service.update(customer),HttpStatus.OK);
	}
}
