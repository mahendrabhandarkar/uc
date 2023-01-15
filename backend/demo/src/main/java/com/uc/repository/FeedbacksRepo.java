package com.uc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.model.Feedbacks;


public interface FeedbacksRepo extends JpaRepository<Feedbacks, Integer> 
{

}
