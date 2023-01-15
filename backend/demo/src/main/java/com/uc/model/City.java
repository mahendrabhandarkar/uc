package com.uc.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private int cityId;

	@Column(name = "city_name")
	private String cityName;

	@Column(name = "city_state")
	private String cityState;

	@Column(name = "city_country")
	private String cityCountry;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityState(String cityState) {
		this.cityState = cityState;
	}

	public String getCityState() {
		return cityState;
	}
	
	public void setCityCountry(String cityCountry) {
		this.cityCountry = cityCountry;
	}

	public String getCityCountry() {
		return cityCountry;
	}
	public City() {
		super();
	}

}
