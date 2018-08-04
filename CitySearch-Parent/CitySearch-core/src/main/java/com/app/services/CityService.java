package com.app.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.CityDaoInterface;
import com.app.entities.CityInfo;
import com.app.entities.CityInfoId;
import com.app.exceptions.InvalidParametersException;
import com.app.models.City;

public class CityService {
  @Autowired
  private CityDaoInterface cityDaoImpl;

  private CityInfo cityInfo;
  private final Logger LOGGER = LoggerFactory.getLogger(CityService.class);

  public void processAddCity(City city) {
    LOGGER.info("0;Processing Add City");
    try {
      cityInfo = new CityInfo();
      CityInfoId cityInfoId = new CityInfoId();
      cityInfoId.setCityCountry(city.getCityCountry());
      cityInfoId.setCityName(city.getCityName());
      cityInfo.setCityShortName(city.getCityShortName());
      cityInfo.setCityState(city.getCityState());
      cityInfo.setCityInfoId(cityInfoId);
      cityDaoImpl.addCity(cityInfo);
    } catch (Exception e) {
      LOGGER.info("0;Exception while processing");
      throw new InvalidParametersException(e.getMessage());
    }
  }
}
