package com.lvc.app.lvc_spring_backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvc.app.lvc_spring_backend.dtos.UserDTO;
import com.lvc.app.lvc_spring_backend.repository.UserRepository;

@Service
public class UserServices implements Services<UserDTO> {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDTO add(UserDTO user) {
		return userRepository.save(user);
	}

	@Override
	public List<UserDTO> fetchAll() {
		return userRepository.findAll();
	}

	@Override
	public Optional<UserDTO> get(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public void remove(Long id) {
		if(get(id).isPresent()) {
			userRepository.delete(get(id).get());
		}
		
	}

}
