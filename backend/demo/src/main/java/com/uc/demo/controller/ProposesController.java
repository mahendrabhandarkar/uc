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

import com.uc.demo.model.Proposes;
import com.uc.demo.service.ProposesService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/proposes")
public class ProposesController {
	@Autowired
	ProposesService availsService;

	private static final Logger logger = LogManager.getLogger(ProposesController.class);
	
	@RequestMapping(value="/proposes", method=RequestMethod.POST)
	public Proposes createProposes(@RequestBody Proposes av) {
	    return availsService.createProposes(av);
	}
	
	@RequestMapping(value="/proposes", method=RequestMethod.GET)
	public List<Proposes> readProposes() {
		logger.info("Welcome to UrbanController");
	    return availsService.getProposes();
	}

	@RequestMapping(value="/proposes/{proposesId}", method=RequestMethod.PUT)
	public Proposes readProposes(@PathVariable(value = "proposesId") Integer id, @RequestBody Proposes availDetails) {
	    return availsService.updateProposes(id, availDetails);
	}

	@RequestMapping(value="/proposes/{proposesId}", method=RequestMethod.DELETE)
	public void deleteProposes(@PathVariable(value = "proposesId") Integer id) {
		availsService.deleteProposes(id);
	}
}