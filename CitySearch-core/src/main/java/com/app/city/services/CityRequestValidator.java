package com.app.city.services;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.app.city.exceptions.InvalidParametersException;
import com.app.city.models.City;
import com.app.city.utils.CitySearchConstants;

@Service
public class CityRequestValidator {
  private final Logger LOGGER = LoggerFactory.getLogger(CityRequestValidator.class);


  public void validateAtleatOneParamPresence(City city, HttpServletResponse response) {
    LOGGER.info("100004;Validating the City add request");
    if (StringUtils.isBlank(city.getCityCountry()) || StringUtils.isBlank(city.getCityName())
        || StringUtils.isBlank(city.getCityState())) {
      LOGGER.info("100003;At least one parameter should be present");
      throw new InvalidParametersException(
          String.format(CitySearchConstants.ONE_MANDATORY_PARAM_REQUIRED), response);
    }
  }
}
