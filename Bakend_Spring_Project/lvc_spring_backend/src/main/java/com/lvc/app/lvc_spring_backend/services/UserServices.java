package com.lvc.app.lvc_spring_backend.services;

import java.util.List;
import java.util.Optional;
import org.modelmapper.TypeToken;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lvc.app.lvc_spring_backend.dos.UserDO;
import com.lvc.app.lvc_spring_backend.dtos.UserDTO;
import com.lvc.app.lvc_spring_backend.repository.UserRepository;

@Service
@Scope("prototype")
public class UserServices {

	@Autowired
	UserRepository userRepository;
	@Autowired
	private ModelMapper modelMapper;

	public UserDTO add(UserDTO user) {
		UserDO userDO = modelMapper.map(user, UserDO.class);
		return modelMapper.map(userRepository.save(userDO), new TypeToken<UserDTO>() {
		}.getType());
	}

	public List<UserDTO> fetchAll() {
		return modelMapper.map(userRepository.findAll(), new TypeToken<List<UserDTO>>() {
		}.getType());
	}

	public UserDTO getById(Long id) {
		return modelMapper.map(userRepository.findById(id).get(), new TypeToken<UserDTO>() {
		}.getType());
	}

	public List<UserDTO> remove(Long id) {
		userRepository.deleteById(id);
		return fetchAll();
	}

}
