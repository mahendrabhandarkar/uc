package com.uc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uc.demo.model.Avails;
import com.uc.demo.service.AvailsService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/avails")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AvailsController {
	@Autowired
	AvailsService availsService;
	
	@RequestMapping(value="/availability", method=RequestMethod.POST)
	public Avails createAvailability(@RequestBody Avails av) {
	    return availsService.createAvailability(av);
	}
	
	@RequestMapping(value="/availability", method=RequestMethod.GET)
	public List<Avails> readEmployees() {
	    return availsService.getAvailability();
	}

	@RequestMapping(value="/availability/{availId}", method=RequestMethod.PUT)
	public Avails readEmployees(@PathVariable(value = "availId") Integer id, @RequestBody Avails availDetails) {
	    return availsService.updateAvailability(id, availDetails);
	}

	@RequestMapping(value="/availability/{availId}", method=RequestMethod.DELETE)
	public void deleteEmployees(@PathVariable(value = "availId") Integer id) {
		availsService.deleteAvailability(id);
	}
	
	@GetMapping("/getDiscount")
    public String discount() {
     //   LOGGER.info("discount service called....");
        return "added discount 15%";
    }
//  Code with WebClient refer: https://github.com/spring-guides/getting-started-guides
//	@RequestMapping(value="availability/{availId}?custId={custId}", method=RequestMethod.GET)
//	public Customer getCustomers(@PathVariable(value={"availId","custId") Integer Id)
//	{
//		
//	}
}