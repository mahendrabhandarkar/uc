package com.uc.demoe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.demoe.model.City;
import com.uc.demoe.repository.CityRepo;
import java.util.List;

@Service
public class CityService {

	@Autowired
	private CityRepo cityRepo;
	
	// CREATE 
	public City createCity(City av) {
	    return cityRepo.save(av);
	}

	// READ
	public List<City> getCity() {
	    return cityRepo.findAll();
	}

	// DELETE
	public void deleteCity(Integer catId) {
		cityRepo.deleteById(catId);
	}
	
	// UPDATE
	public City updateCity(Integer catId, City availDetails) {
		City av = cityRepo.findById(catId).get();
		av.setCityName(availDetails.getCityName());
		av.setCityState(availDetails.getCityState());
		av.setCityCountry(availDetails.getCityCountry());
	    return cityRepo.save(av);
	}
}
