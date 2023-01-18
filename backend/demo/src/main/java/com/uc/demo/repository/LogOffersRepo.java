package com.uc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demo.model.LogOffers;

@Repository 
public interface LogOffersRepo extends JpaRepository<LogOffers, Integer> 
{

}
