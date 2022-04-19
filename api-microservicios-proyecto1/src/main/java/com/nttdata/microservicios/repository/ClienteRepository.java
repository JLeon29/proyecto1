package com.nttdata.microservicios.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.microservicios.model.Customer;

@Repository
public interface ClienteRepository extends ReactiveMongoRepository<Customer, Long> {

}
