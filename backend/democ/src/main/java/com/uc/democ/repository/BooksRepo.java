package com.uc.democ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.democ.model.Books;

@Repository 
public interface BooksRepo extends JpaRepository<Books, Integer> 
{

}
