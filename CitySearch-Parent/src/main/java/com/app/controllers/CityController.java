package com.app.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.exceptions.InvalidParametersException;
import com.app.models.City;
import com.app.services.CityRequestValidator;
import com.app.services.CityService;

@Controller
public class CityController {

	@Autowired
	private CityRequestValidator cityRequestValidator;

	@Autowired
	private CityService cityService;

	private final Logger LOGGER = LoggerFactory.getLogger(CityController.class);

	@RequestMapping(value = "/app/city/{city}", method = RequestMethod.GET, consumes = "application/json")
	public void handleCitySearchRequest(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("city") String city) {

		LOGGER.info("100001;Received search request for the city :{}", city);
		response.setStatus(HttpServletResponse.SC_OK);
	}

	@RequestMapping(value = "/app/city/", method = RequestMethod.POST, consumes = "application/json")
	public void addCity(HttpServletRequest request, HttpServletResponse response, @RequestBody City city) {
		LOGGER.info("100002;Received add request for the city :" + city.getCityName());
		cityRequestValidator.validateAtleatOneParamPresence(city, response);
		cityService.processAddCity(city);
		response.setStatus(HttpServletResponse.SC_OK);
	}

	@ExceptionHandler(InvalidParametersException.class)
	public void handleInvalidParameterException(InvalidParametersException invalidParametersException,
			HttpServletResponse response) throws IOException {
		response.sendError(HttpServletResponse.SC_BAD_REQUEST, invalidParametersException.getMessage());
	}
}
