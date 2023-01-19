package com.uc.demok.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demok.model.Proposes;

@Repository 
public interface ProposesRepo extends JpaRepository<Proposes, Integer> 
{

}
