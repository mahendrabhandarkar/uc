package com.uc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demo.model.Feedbacks;

@Repository 
public interface FeedbacksRepo extends JpaRepository<Feedbacks, Integer> 
{

}
