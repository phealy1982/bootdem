package com.phealy1982;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class BootdemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootdemApplication.class, args);
		
		System.out.println("starting app...");	
	}
}

