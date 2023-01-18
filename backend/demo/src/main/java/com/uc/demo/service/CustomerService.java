package com.uc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.demo.model.Customer;
import com.uc.demo.repository.CustomerRepo;
import java.util.List;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo cityRepo;
	
	// CREATE 
	public Customer createCustomer(Customer av) {
	    return cityRepo.save(av);
	}

	// READ
	public List<Customer> getCustomer() {
	    return cityRepo.findAll();
	}

	// DELETE
	public void deleteCustomer(Integer custId) {
		cityRepo.deleteById(custId);
	}
	
	// UPDATE
	public Customer updateCustomer(Integer custId, Customer availDetails) {
		Customer av = cityRepo.findById(custId).get();
		av.setCityId(availDetails.getCityId());
		av.setCreatedAt(availDetails.getCreatedAt());
		av.setCreatedBy(availDetails.getCreatedBy());
		av.setCustEmail(availDetails.getCustEmail());
		av.setCustGender(availDetails.getCustGender());
		av.setCustId(availDetails.getCustId());
		av.setCustMobile(availDetails.getCustMobile());
		av.setCustName(availDetails.getCustName());
		av.setCustStreet(availDetails.getCustStreet());
		av.setUpdatedAt(availDetails.getUpdatedAt());
		av.setUpdatedBy(availDetails.getUpdatedBy());
	    return cityRepo.save(av);
	}
}
