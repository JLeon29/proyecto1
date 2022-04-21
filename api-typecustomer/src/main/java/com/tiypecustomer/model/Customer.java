package com.tiypecustomer.model;

import lombok.Data;

@Data
public class Customer {

	
	private Long id;
	private String nombres;
	private String apellido_paterno;
	private String apellido_materno;
	private String dni;
	private String correo;

}
