package com.uc.demol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demol.model.Services;

@Repository 
public interface ServiceRepo extends JpaRepository<Services, Integer> 
{

}
