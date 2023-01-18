package com.uc.demo.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "avails")
public class Avails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "avails_id")
	private int availsId;

	@Column(name = "off_id")
	private int offId;

	@Column(name = "cust_id")
	private int custId;


	public void setAvailsId(int availsId) {
		this.availsId = availsId;
	}

	public int getAvailsId() {
		return availsId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getCustId() {
		return custId;
	}

	public void setOffId(int offId) {
		this.offId = offId;
	}
	
	public int getOffId() {
		return offId;
	}

	public Avails() {
		super();

	}

}
