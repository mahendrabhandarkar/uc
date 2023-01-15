package com.uc.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offer")
public class Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "off_id")
	private int offId;

	@Column(name = "off_name")
	private String offName;

	@Column(name = "off_desc")
	private String offDesc;

	@Column(name = "off_discount")
	private String offDiscount;


	public int getOffId() {
		return offId;
	}

	public void setOffId(int offId) {
		this.offId = offId;
	}

	public String getOffName() {
		return offName;
	}

	public void setOffName(String offName) {
		this.offName = offName;
	}

	public String getOffDesc() {
		return offDesc;
	}

	public void setOffDesc(String offDesc) {
		this.offDesc = offDesc;
	}
	
	public String getOffDiscount() {
		return offDiscount;
	}

	public void setOffDiscount(String offDiscount) {
		this.offDiscount = offDiscount;
	}

	public Offer() {
		super();
	}
}
