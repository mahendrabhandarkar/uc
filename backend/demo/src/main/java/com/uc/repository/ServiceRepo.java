package com.uc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.model.Service;


public interface ServiceRepo extends JpaRepository<Service, Integer> 
{

}