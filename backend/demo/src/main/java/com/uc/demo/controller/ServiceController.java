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

import com.uc.demo.model.Services;
import com.uc.demo.service.ServiceService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/service")
public class ServiceController {
	@Autowired
	ServiceService availsService;

	private static final Logger logger = LogManager.getLogger(ServiceController.class);
	
	@RequestMapping(value="/service", method=RequestMethod.POST)
	public Services createService(@RequestBody Services av) {
	    return availsService.createService(av);
	}
	
	@RequestMapping(value="/service", method=RequestMethod.GET)
	public List<Services> readService() {
		logger.info("Welcome to UrbanController");
	    return availsService.getService();
	}

	@RequestMapping(value="/service/{servId}", method=RequestMethod.PUT)
	public Services readService(@PathVariable(value = "servId") Integer id, @RequestBody Services availDetails) {
	    return availsService.updateService(id, availDetails);
	}

	@RequestMapping(value="/service/{servId}", method=RequestMethod.DELETE)
	public void deleteService(@PathVariable(value = "servId") Integer id) {
		availsService.deleteService(id);
	}
}