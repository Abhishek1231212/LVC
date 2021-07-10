package com.lvc.app.lvc_spring_backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lvc")
public class ApplicationManagementController {
	@RequestMapping("/users")
	public void fetchAllUsers() {
		
	}
}
