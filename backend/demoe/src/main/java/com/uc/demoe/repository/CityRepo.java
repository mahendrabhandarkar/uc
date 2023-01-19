package com.uc.demoe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demoe.model.City;

@Repository 
public interface CityRepo extends JpaRepository<City, Integer> 
{

}
