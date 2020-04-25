package com.capg.springjpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE,reason="Username or password is invalid")
public class InvalidLogin extends RuntimeException {

	
	public InvalidLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
