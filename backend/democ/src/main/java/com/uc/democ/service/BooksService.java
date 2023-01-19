package com.uc.democ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.democ.model.Books;
import com.uc.democ.repository.BooksRepo;
import java.util.List;

@Service
public class BooksService {

	@Autowired
	private BooksRepo booksRepo;
	
	// CREATE 
	public Books createBooks(Books av) {
	    return booksRepo.save(av);
	}

	// READ
	public List<Books> getBooks() {
	    return booksRepo.findAll();
	}

	// DELETE
	public void deleteBooks(Integer bookId) {
		booksRepo.deleteById(bookId);
	}
	
	// UPDATE
	public Books updateBooks(Integer bookId, Books availDetails) {
		Books av = booksRepo.findById(bookId).get();
		av.setBookDate(availDetails.getBookDate());
		av.setBookRemarks(availDetails.getBookRemarks());
		av.setBookServdate(availDetails.getBookServdate());
		av.setPaymentMethod(availDetails.getPaymentMethod());
		av.setCustId(availDetails.getCustId());
		av.setServId(availDetails.getServId());
		av.setCreatedAt(availDetails.getCreatedAt());
		av.setUpdatedAt(availDetails.getUpdatedAt());
		av.setCreatedBy(availDetails.getCreatedBy());
		av.setUpdatedBy(availDetails.getUpdatedBy());
	    return booksRepo.save(av);
	}
}
