package com.uc.demoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demoi.model.Offer;

@Repository 
public interface OfferRepo extends JpaRepository<Offer, Integer> 
{

}
