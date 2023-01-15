package com.uc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.model.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Integer> 
{

}
