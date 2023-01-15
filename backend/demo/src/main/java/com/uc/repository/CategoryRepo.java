package com.uc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.model.Category;


public interface CategoryRepo extends JpaRepository<Category, Integer> 
{

}
