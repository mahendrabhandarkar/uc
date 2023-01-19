package com.uc.demod.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demod.model.Category;

@Repository 
public interface CategoryRepo extends JpaRepository<Category, Integer> 
{

}
