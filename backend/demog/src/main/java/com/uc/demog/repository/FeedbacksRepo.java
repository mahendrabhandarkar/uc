package com.uc.demog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demog.model.Feedbacks;

@Repository 
public interface FeedbacksRepo extends JpaRepository<Feedbacks, Integer> 
{

}
