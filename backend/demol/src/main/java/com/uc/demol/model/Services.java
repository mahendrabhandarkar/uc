package com.uc.demol.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "service")
public class Services {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "serv_id")
	private int servId;

	@Column(name = "serv_name")
	private String servName;

	@Column(name = "serv_desc")
	private String servDesc;

	@Column(name = "serv_rating")
	private String servRating;
	
	@Column(name = "serv_email")
	private String servEmail;

	@Column(name = "serv_mobile")
	private String servMobile;

	@Column(name = "serv_cost")
	private String servCost;
	
	@Column(name = "serv_commission")
	private String servCommission;
	
	@Column(name = "serv_street")
	private String servStreet;

	@Column(name = "city_id")
	private int cityId;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "created_at")
	private Date createdAt;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "updated_at")
	private Date updatedAt;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;

	public int getServId() {
		return servId;
	}

	public void setServId(int servId) {
		this.servId = servId;
	}

	public String getServName() {
		return servName;
	}

	public void setServName(String servName) {
		this.servName = servName;
	}
	
	public String getServDesc() {
		return servDesc;
	}

	public void setServDesc(String servDesc) {
		this.servDesc = servDesc;
	}
	
	public String getServRating() {
		return servRating;
	}

	public void setServRating(String servRating) {
		this.servRating = servRating;
	}
	
	public String getServEmail() {
		return servEmail;
	}

	public void setServEmail(String servEmail) {
		this.servEmail = servEmail;
	}
	
	public String getServMobile() {
		return servMobile;
	}

	public void setServMobile(String servMobile) {
		this.servMobile = servMobile;
	}

	public String getServCost() {
		return servCost;
	}

	public void setServCost(String servCost) {
		this.servCost = servCost;
	}
	
	public String getServCommission() {
		return servCommission;
	}

	public void setServCommission(String servCommission) {
		this.servCommission = servCommission;
	}
	
	public String getServStreet() {
		return servStreet;
	}

	public void setServStreet(String servStreet) {
		this.servStreet = servStreet;
	}
	
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Services() {
		super();
	}
}
