package com.uc.demof.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.demof.model.Customer;

@Repository 
public interface CustomerRepo extends JpaRepository<Customer, Integer> 
{

}
