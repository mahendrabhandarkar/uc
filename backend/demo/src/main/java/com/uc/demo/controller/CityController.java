package com.uc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uc.demo.model.City;
import com.uc.demo.service.CityService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/city")
public class CityController {
	@Autowired
	CityService availsService;

	private static final Logger logger = LogManager.getLogger(CityController.class);
	
	@RequestMapping(value="/city", method=RequestMethod.POST)
	public City createCity(@RequestBody City av) {
	    return availsService.createCity(av);
	}
	
	@RequestMapping(value="/city", method=RequestMethod.GET)
	public List<City> readCity() {
		logger.info("Welcome to UrbanController");
	    return availsService.getCity();
	}

	@RequestMapping(value="/city/{cityId}", method=RequestMethod.PUT)
	public City readCity(@PathVariable(value = "cityId") Integer id, @RequestBody City availDetails) {
	    return availsService.updateCity(id, availDetails);
	}

	@RequestMapping(value="/city/{cityId}", method=RequestMethod.DELETE)
	public void deleteCity(@PathVariable(value = "cityId") Integer id) {
		availsService.deleteCity(id);
	}
}