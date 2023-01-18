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

import com.uc.demo.model.LogOffers;
import com.uc.demo.service.LogOffersService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/logoffers")
public class LogOffersController {
	@Autowired
	LogOffersService availsService;

	private static final Logger logger = LogManager.getLogger(LogOffersController.class);
	
	@RequestMapping(value="/logoffers", method=RequestMethod.POST)
	public LogOffers createLogOffers(@RequestBody LogOffers av) {
	    return availsService.createLogOffers(av);
	}
	
	@RequestMapping(value="/logoffers", method=RequestMethod.GET)
	public List<LogOffers> readLogOffers() {
		logger.info("Welcome to UrbanController");
	    return availsService.getLogOffers();
	}

	@RequestMapping(value="/logoffers/{idLogOffers}", method=RequestMethod.PUT)
	public LogOffers readLogOffers(@PathVariable(value = "idLogOffers") Integer id, @RequestBody LogOffers availDetails) {
	    return availsService.updateLogOffers(id, availDetails);
	}

	@RequestMapping(value="/logoffers/{idLogOffers}", method=RequestMethod.DELETE)
	public void deleteLogOffers(@PathVariable(value = "idLogOffers") Integer id) {
		availsService.deleteLogOffers(id);
	}
}