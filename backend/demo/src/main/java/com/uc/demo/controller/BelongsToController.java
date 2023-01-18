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

import com.uc.demo.model.BelongsTo;
import com.uc.demo.service.BelongsToService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/belongs_to")
public class BelongsToController {
	@Autowired
	BelongsToService availsService;
	
	private static final Logger logger = LogManager.getLogger(BelongsToController.class);
	
	@RequestMapping(value="/belongsto", method=RequestMethod.POST)
	public BelongsTo createBelongsTo(@RequestBody BelongsTo av) {
	    return availsService.createBelongsTo(av);
	}
	
	@RequestMapping(value="/belongsto", method=RequestMethod.GET)
	public List<BelongsTo> readBelongsTo() {
		logger.info("Welcome to UrbanController");
	    return availsService.getBelongsTo();
	}

	@RequestMapping(value="/belongsto/{belongsId}", method=RequestMethod.PUT)
	public BelongsTo readBelongsTo(@PathVariable(value = "belongsId") Integer id, @RequestBody BelongsTo availDetails) {
	    return availsService.updateBelongsTo(id, availDetails);
	}

	@RequestMapping(value="/belongsto/{belongsId}", method=RequestMethod.DELETE)
	public void deleteBelongsTo(@PathVariable(value = "belongsId") Integer id) {
		availsService.deleteBelongsTo(id);
	}
}