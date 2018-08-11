package com.app.city.configurations;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.app.city.entities.CityInfo;

@SuppressWarnings("deprecation")
@Configuration
@EnableTransactionManagement
@EntityScan(basePackageClasses=CityInfo.class)
public class StandAloneDbConfiguration {

  @Bean
  public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
       HibernateJpaSessionFactoryBean sessionFactory = new HibernateJpaSessionFactoryBean();
       sessionFactory.setEntityManagerFactory(emf);
       return sessionFactory;
  }
}
