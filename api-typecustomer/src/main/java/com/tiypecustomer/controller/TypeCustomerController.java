package com.tiypecustomer.controller;

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

import com.tiypecustomer.model.TypeCustomer;
import com.tiypecustomer.service.ITypeCustomerService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/typecustomer")
public class TypeCustomerController {
	
	@Autowired
	private ITypeCustomerService service;
	
	@PostMapping("/save")
	public ResponseEntity<Mono<TypeCustomer>> saveType(@RequestBody TypeCustomer typeCustomer){
		return new ResponseEntity<Mono<TypeCustomer>>(service.save(typeCustomer), HttpStatus.CREATED);
				
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<Flux<TypeCustomer>> findAllCustomer(){

		
		return new ResponseEntity<Flux<TypeCustomer>>(service.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Mono<TypeCustomer>> findByIdType(@PathVariable Long id){
		Mono<TypeCustomer> typeCustomer= service.findById(id);
		return new ResponseEntity<Mono<TypeCustomer>>(typeCustomer,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Mono<Void>> deleteType(@RequestBody TypeCustomer typeCustomer){
		return new ResponseEntity<Mono<Void>>(service.delete(typeCustomer), HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Mono<TypeCustomer>> updateTyper(@RequestBody TypeCustomer typeCustomer){
		return new ResponseEntity<Mono<TypeCustomer>>(service.update(typeCustomer),HttpStatus.OK);
	}

}
