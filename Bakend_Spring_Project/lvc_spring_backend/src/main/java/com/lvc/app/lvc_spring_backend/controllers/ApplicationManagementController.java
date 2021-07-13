package com.lvc.app.lvc_spring_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvc.app.lvc_spring_backend.dtos.UserDTO;
import com.lvc.app.lvc_spring_backend.services.UserServices;

@RestController
@RequestMapping("/lvc")
public class ApplicationManagementController {
	
	@Autowired
	UserServices userServices;
	
	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> fetchAllUsers() {
		List<UserDTO> users = userServices.fetchAll();
		return ResponseEntity.ok(users);
	}
	@GetMapping("/users/{id}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable String id){
		UserDTO user = userServices.getById(Long.parseLong(id));
		return ResponseEntity.ok(user);
	}
	@PostMapping("/users")
	public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO user){
		return ResponseEntity.ok(userServices.add(user));
	}
	@PutMapping("/users")
	public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO user){
		return ResponseEntity.ok(userServices.add(user));
	}
	@DeleteMapping("/users/{id}")
	public ResponseEntity<List<UserDTO>> deleteUser(@PathVariable String id){
		List<UserDTO> users = userServices.remove(Long.parseLong(id));
		return ResponseEntity.ok(users);
	}
}
