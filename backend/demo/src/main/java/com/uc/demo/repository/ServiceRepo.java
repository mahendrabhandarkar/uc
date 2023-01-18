package com.uc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demo.model.Services;

@Repository 
public interface ServiceRepo extends JpaRepository<Services, Integer> 
{

}
