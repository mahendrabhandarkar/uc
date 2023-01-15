package com.uc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.model.Offer;


public interface OfferRepo extends JpaRepository<Offer, Integer> 
{

}
