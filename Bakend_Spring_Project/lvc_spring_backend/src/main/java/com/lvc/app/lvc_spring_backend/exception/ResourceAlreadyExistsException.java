package com.lvc.app.lvc_spring_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class ResourceAlreadyExistsException extends RuntimeException{

	private static final long serialVersionUID = 2379632535651298371L;
	
	public ResourceAlreadyExistsException(String message) {
		super(message);
	}
}
