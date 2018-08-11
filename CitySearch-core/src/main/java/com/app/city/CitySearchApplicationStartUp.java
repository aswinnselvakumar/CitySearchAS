package com.app.city;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Startup class for the application
 */
@SpringBootApplication
@EnableAutoConfiguration
public class CitySearchApplicationStartUp {
	public static void main(String args[]){
		SpringApplication.run(CitySearchApplicationStartUp.class, args);
	}
}
