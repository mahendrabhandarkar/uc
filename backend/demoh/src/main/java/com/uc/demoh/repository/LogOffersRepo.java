package com.uc.demoh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demoh.model.LogOffers;

@Repository 
public interface LogOffersRepo extends JpaRepository<LogOffers, Integer> 
{

}
