package com.uc.demoj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demoj.model.Partner;

@Repository 
public interface PartnerRepo extends JpaRepository<Partner, Integer> 
{

}
