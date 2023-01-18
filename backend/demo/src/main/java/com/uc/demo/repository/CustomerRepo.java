package com.uc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demo.model.Customer;

@Repository 
public interface CustomerRepo extends JpaRepository<Customer, Integer> 
{

}