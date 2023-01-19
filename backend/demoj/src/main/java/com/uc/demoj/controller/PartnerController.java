package com.uc.demoj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uc.demoj.model.Partner;
import com.uc.demoj.service.PartnerService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/partner")
public class PartnerController {
	@Autowired
	PartnerService availsService;

	private static final Logger logger = LogManager.getLogger(PartnerController.class);
	
	@RequestMapping(value="/partner", method=RequestMethod.POST)
	public Partner createPartner(@RequestBody Partner av) {
	    return availsService.createPartner(av);
	}
	
	@RequestMapping(value="/partner", method=RequestMethod.GET)
	public List<Partner> readPartner() {
		logger.info("Welcome to UrbanController");
	    return availsService.getPartner();
	}

	@RequestMapping(value="/partner/{partId}", method=RequestMethod.PUT)
	public Partner readPartner(@PathVariable(value = "partId") Integer id, @RequestBody Partner availDetails) {
	    return availsService.updatePartner(id, availDetails);
	}

	@RequestMapping(value="/partner/{partId}", method=RequestMethod.DELETE)
	public void deletePartner(@PathVariable(value = "partId") Integer id) {
		availsService.deletePartner(id);
	}
}