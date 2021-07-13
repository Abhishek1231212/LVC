package com.lvc.app.lvc_spring_backend;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LvcSpringBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LvcSpringBackendApplication.class, args);
	}
	
	@Bean
	@Qualifier("modelMapperService")
	public ModelMapper modelmapper() {
		return new ModelMapper();
	}
}
