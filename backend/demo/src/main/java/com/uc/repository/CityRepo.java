package com.uc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.model.City;


public interface CityRepo extends JpaRepository<City, Integer> 
{

}
