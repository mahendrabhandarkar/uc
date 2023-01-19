package com.uc.demob.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demob.model.BelongsTo;

@Repository 
public interface BelongsToRepo extends JpaRepository<BelongsTo, Integer> 
{

}
