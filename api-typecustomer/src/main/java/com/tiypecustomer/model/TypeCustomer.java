package com.tiypecustomer.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "typecustomer")
public class TypeCustomer {
	
	private Customer customer;
	private String nombre;
	

}
