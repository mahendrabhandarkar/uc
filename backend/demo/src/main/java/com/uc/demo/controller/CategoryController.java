package com.uc.demo.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uc.demo.model.Category;
import com.uc.demo.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryService availsService;

	private static final Logger logger = LogManager.getLogger(CategoryController.class);
	
	@RequestMapping(value="/category", method=RequestMethod.POST)
	public Category createCategory(@RequestBody Category av) {
	    return availsService.createCategory(av);
	}
	
	@RequestMapping(value="/category", method=RequestMethod.GET)
	public List<Category> readCategory() {
		logger.info("Welcome to UrbanController");
	    return availsService.getCategory();
	}

	@RequestMapping(value="/category/{catId}", method=RequestMethod.PUT)
	public Category readCategory(@PathVariable(value = "catId") Integer id, @RequestBody Category availDetails) {
	    return availsService.updateCategory(id, availDetails);
	}

	@RequestMapping(value="/category/{catId}", method=RequestMethod.DELETE)
	public void deleteCategory(@PathVariable(value = "catId") Integer id) {
		availsService.deleteCategory(id);
	}
}