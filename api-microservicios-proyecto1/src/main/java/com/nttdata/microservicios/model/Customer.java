package com.nttdata.microservicios.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;




@Data
@AllArgsConstructor
@Document(collection = "customers")
public class Customer{
	
	
	@Id
	private Long id;
	private String nombres;
	private String apellido_paterno;
	private String apellido_materno;
	private String dni;
	private String correo;
	private String tipo;
	
	
	


	
	
	
	
	
	

}
