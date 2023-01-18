package com.uc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demo.model.BelongsTo;

@Repository 
public interface BelongsToRepo extends JpaRepository<BelongsTo, Integer> 
{

}
