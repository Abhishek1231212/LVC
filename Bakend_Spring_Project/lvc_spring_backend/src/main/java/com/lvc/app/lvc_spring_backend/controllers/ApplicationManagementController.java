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
		return new ResponseEntity<>(userServices.fetchAll(), HttpStatus.OK);
	}
	@GetMapping("/users/{id}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable long id){
		return new ResponseEntity<UserDTO>(userServices.get(id).get(), HttpStatus.OK);
	}
	@PostMapping("/users")
	public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO user){
		return new ResponseEntity<UserDTO>(userServices.add(user), HttpStatus.CREATED);
	}
	@PutMapping("/users")
	public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO user){
		return new ResponseEntity<UserDTO>(userServices.add(user), HttpStatus.CREATED);
	}
	@DeleteMapping("/users/{id}")
	public ResponseEntity<UserDTO> deleteUser(@PathVariable long id){
		userServices.remove(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
