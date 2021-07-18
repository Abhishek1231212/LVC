package com.lvc.app.lvc_spring_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lvc.app.lvc_spring_backend.dos.UserDO;
import com.lvc.app.lvc_spring_backend.dtos.UserDTO;

@Repository
public interface UserRepository extends JpaRepository<UserDO, Long> {
	boolean existsByName(String name); 	
}
