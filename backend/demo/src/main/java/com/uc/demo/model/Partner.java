package com.uc.demo.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "partner")
public class Partner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "part_id")
	private int partId;

	@Column(name = "part_name")
	private String partName;

	@Column(name = "part_gender")
	private String partGender;

	@Column(name = "part_email")
	private String partEmail;

	@Column(name = "part_mobile")
	private String partMobile;

	@Column(name = "part_profession")
	private String partProfession;

	@Column(name = "serv_id")
	private int servId;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;

	public int getPartId() {
		return partId;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}
	
	public String getPartGender() {
		return partGender;
	}

	public void setPartGender(String partGender) {
		this.partGender = partGender;
	}
	
	public String getPartEmail() {
		return partEmail;
	}

	public void setPartEmail(String partEmail) {
		this.partEmail = partEmail;
	}
	
	public String getPartMobile() {
		return partMobile;
	}

	public void setPartMobile(String partMobile) {
		this.partMobile = partMobile;
	}

	public String getPartProfession() {
		return partProfession;
	}

	public void setPartProfession(String partProfession) {
		this.partProfession = partProfession;
	}

	public int getServId() {
		return servId;
	}

	public void setServId(int servId) {
		this.servId = servId;
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

	public Partner() {
		super();
	}
}
