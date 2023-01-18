package com.uc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demo.model.Partner;

@Repository 
public interface PartnerRepo extends JpaRepository<Partner, Integer> 
{

}
