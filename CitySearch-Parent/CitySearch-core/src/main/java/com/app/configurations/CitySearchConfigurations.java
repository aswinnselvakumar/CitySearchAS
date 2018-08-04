package com.app.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.controllers.CityController;
import com.app.dao.CityDaoImpl;
import com.app.dao.CityDaoInterface;
import com.app.services.CityRequestValidator;
import com.app.services.CityService;

@Configuration
public class CitySearchConfigurations {

  @Bean
  public CityRequestValidator getCityRequestValidator(){
    return new CityRequestValidator();
  }
  
  @Bean
  public CityController getCityController() {
    return new CityController();
  }
  
  @Bean
  public CityDaoInterface getCityDaoImpl() {
    return new CityDaoImpl();
  }
  
  @Bean
  public CityService getCityService() {
    return new CityService();
  }
}
