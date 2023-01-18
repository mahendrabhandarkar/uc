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

import com.uc.demo.model.Customer;
import com.uc.demo.service.CustomerService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService availsService;
	
	private static final Logger logger = LogManager.getLogger(CustomerController.class);
	
	@RequestMapping(value="/customer", method=RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer av) {
	    return availsService.createCustomer(av);
	}
	
	@RequestMapping(value="/customer", method=RequestMethod.GET)
	public List<Customer> readCustomer() {
		logger.info("Welcome to UrbanController");
	    return availsService.getCustomer();
	}

	@RequestMapping(value="/customer/{custId}", method=RequestMethod.PUT)
	public Customer readCustomer(@PathVariable(value = "custId") Integer id, @RequestBody Customer availDetails) {
	    return availsService.updateCustomer(id, availDetails);
	}

	@RequestMapping(value="/customer/{custId}", method=RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable(value = "custId") Integer id) {
		availsService.deleteCustomer(id);
	}
}