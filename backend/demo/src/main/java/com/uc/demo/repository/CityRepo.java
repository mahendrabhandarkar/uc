package com.uc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demo.model.City;

@Repository 
public interface CityRepo extends JpaRepository<City, Integer> 
{

}
