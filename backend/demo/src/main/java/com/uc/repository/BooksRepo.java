package com.uc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.model.Books;


public interface BooksRepo extends JpaRepository<Books, Integer> 
{

}
