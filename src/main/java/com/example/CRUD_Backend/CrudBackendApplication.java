package com.example.CRUD_Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//extends SpringBootServletInitializer
@SpringBootApplication
public class CrudBackendApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(CrudBackendApplication.class);
//	}

}
