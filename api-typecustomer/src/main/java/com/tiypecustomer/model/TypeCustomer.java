package com.tiypecustomer.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "typecustomer")
public class TypeCustomer {
	
	private Long id;
	private String nombre;
	private Integer numero;
	private Long customerId;

}
