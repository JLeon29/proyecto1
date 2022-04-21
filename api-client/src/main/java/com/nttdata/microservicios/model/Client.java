package com.nttdata.microservicios.model;

import javax.validation.constraints.Email;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(collection = "client")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client{
	
	
	@Id
	private String id;
	private String name;
	private String clientIdType;
	@Indexed(unique = true)
	private String clientIdNumber;
	@Email
	private String email;
	private String phone;
	private String address;

	private ClientType clientType;
	
	
	


	
	
	
	
	
	

}
