package com.capg.springjpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="No Such Trainer Id is Available")
public class NoSuchTrainee extends RuntimeException {

	public NoSuchTrainee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}