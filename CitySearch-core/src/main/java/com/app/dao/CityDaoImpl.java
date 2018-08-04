package com.app.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entities.CityInfo;
@Repository
@Transactional
public class CityDaoImpl implements CityDaoInterface {

  private final Logger LOGGER = LoggerFactory.getLogger(CityDaoImpl.class);
  @Autowired
  private SessionFactory sessionFactory;

  public Session getSession() {
    return sessionFactory.getCurrentSession();
  }

//  @Override
  public void addCity(CityInfo city) {
    LOGGER.info("0;Adding City details to DB");
    getSession().save(city);

   /* if (isSuccess >= 1) {
      LOGGER.info("0; Success");
    } else {
      LOGGER.info("0; Failure");
    }*/
  }
}
