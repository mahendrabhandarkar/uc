package com.uc.democ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uc.democ.model.Books;
import com.uc.democ.service.BooksService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/books")
public class BooksController {
	@Autowired
	BooksService availsService;
	
	private static final Logger logger = LogManager.getLogger(BooksController.class);
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public Books createBooks(@RequestBody Books av) {
	    return availsService.createBooks(av);
	}
	
	@RequestMapping(value="/books", method=RequestMethod.GET)
	public List<Books> readBooks() {
		logger.info("Welcome to UrbanController");
	    return availsService.getBooks();
	}

	@RequestMapping(value="/books/{bookId}", method=RequestMethod.PUT)
	public Books readBooks(@PathVariable(value = "bookId") Integer id, @RequestBody Books availDetails) {
	    return availsService.updateBooks(id, availDetails);
	}

	@RequestMapping(value="/books/{bookId}", method=RequestMethod.DELETE)
	public void deleteBooks(@PathVariable(value = "bookId") Integer id) {
		availsService.deleteBooks(id);
	}
}