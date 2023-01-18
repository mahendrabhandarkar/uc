package com.uc.demo.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proposes")
public class Proposes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "proposes_id")
	private int proposesId;

	@Column(name = "serv_id")
	private int servId;
	
	@Column(name = "off_id")
	private int offId;


	public int getProposesId() {
		return proposesId;
	}

	public void setProposesId(int proposesId) {
		this.proposesId = proposesId;
	}

	public int getServId() {
		return servId;
	}

	public void setServId(int servId) {
		this.servId = servId;
	}

	public int getOffId() {
		return offId;
	}

	public void setOffId(int offId) {
		this.offId = offId;
	}
	
	public Proposes() {
		super();
	}

}
