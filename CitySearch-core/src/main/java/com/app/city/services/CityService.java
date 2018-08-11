package com.app.city.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.city.dao.CityDaoInterface;
import com.app.city.entities.CityInfo;
import com.app.city.entities.CityInfoId;
import com.app.city.exceptions.InvalidParametersException;
import com.app.city.models.City;
@Service
public class CityService implements CityServiceInterface {
	@Autowired
	private CityDaoInterface cityDaoImpl;

	private CityInfo cityInfo;
	private final Logger LOGGER = LoggerFactory.getLogger(CityService.class);

	/*
	 * This method process the incoming Add request 
	 * and persist into DB
	 * 
	 */
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
