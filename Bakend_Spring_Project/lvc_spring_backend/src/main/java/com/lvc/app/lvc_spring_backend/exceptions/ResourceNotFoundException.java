package com.lvc.app.lvc_spring_backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -7821072537116891668L;
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
