package com.uc.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "log_offers")
public class LogOffers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_log_offers")
	private int idLogOffers;

	@Column(name = "action")
	private String action;

	@Column(name = "off_id")
	private int offId;

	@Column(name = "off_name")
	private String offName;

	@Column(name = "off_desc")
	private String offDesc;

	@Column(name = "off_discount")
	private String offDiscount;

	@Column(name = "changed_on")
	private int changedOn;

	public int getIdLogOffers() {
		return idLogOffers;
	}

	public void setIdLogOffers(int idLogOffers) {
		this.idLogOffers = idLogOffers;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}

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

	public int getChangedOn() {
		return changedOn;
	}

	public void setChangedOn(int changedOn) {
		this.changedOn = changedOn;
	}
	
	public LogOffers() {
		super();
	}

}
