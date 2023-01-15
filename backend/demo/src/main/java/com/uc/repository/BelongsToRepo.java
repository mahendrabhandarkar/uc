package com.uc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.model.BelongsTo;


public interface BelongsToRepo extends JpaRepository<BelongsTo, Integer> 
{

}
