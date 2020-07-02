package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication

@EntityScan( basePackages = {"security.entity"} )
public class EcuavidApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcuavidApplication.class, args);
		
	}

}
