package com.uc.demo.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedbacks")
public class Feedbacks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fb_id")
	private int fbId;

	@Column(name = "fb_rating")
	private String fbRating;

	@Column(name = "fb_desc")
	private String fbDesc;

	@Column(name = "fb_date")
	private Date fbDate;

	@Column(name = "cust_id")
	private int custId;

	@Column(name = "part_id")
	private int partId;

	public int getFbId() {
		return fbId;
	}

	public void setFbId(int fbId) {
		this.fbId = fbId;
	}

	public void setFbRating(String fbRating) {
		this.fbRating = fbRating;
	}

	public String getFbRating() {
		return fbRating;
	}
	
	public void setFbDesc(String fbDesc) {
		this.fbDesc = fbDesc;
	}

	public String getFbDesc() {
		return fbDesc;
	}

	public void setFbDate(Date fbDate) {
		this.fbDate = fbDate;
	}

	public Date getFbDate() {
		return fbDate;
	}
	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getPartId() {
		return partId;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public Feedbacks() {
		super();
	}

}
