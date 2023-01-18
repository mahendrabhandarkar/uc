package com.uc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.demo.model.Category;
import com.uc.demo.repository.CategoryRepo;
import java.util.List;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;
	
	// CREATE 
	public Category createCategory(Category av) {
	    return categoryRepo.save(av);
	}

	// READ
	public List<Category> getCategory() {
	    return categoryRepo.findAll();
	}

	// DELETE
	public void deleteCategory(Integer catId) {
		categoryRepo.deleteById(catId);
	}
	
	// UPDATE
	public Category updateCategory(Integer catId, Category availDetails) {
		Category av = categoryRepo.findById(catId).get();
		av.setCatName(availDetails.getCatName());
	    return categoryRepo.save(av);
	}
}
