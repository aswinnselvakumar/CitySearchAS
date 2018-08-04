package com.app.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.app.configurations")
public class CitySearchApplicationStartUp {
	public static void main(String args[]){
		SpringApplication.run(CitySearchApplicationStartUp.class, args);
	}
}
