package com.lvc.app.lvc_spring_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -2329150451116184488L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
