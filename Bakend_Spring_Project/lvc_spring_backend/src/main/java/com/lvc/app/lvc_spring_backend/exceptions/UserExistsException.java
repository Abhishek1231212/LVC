package com.lvc.app.lvc_spring_backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class UserExistsException extends RuntimeException{

	private static final long serialVersionUID = -2615458178254982127L;
	public UserExistsException(String message) {
		super(message);
	}
}
