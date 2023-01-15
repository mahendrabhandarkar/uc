package com.uc.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "belongs_to")
public class BelongsTo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "belongs_id")
	private int belongsId;

	@Column(name = "serv_id")
	private int servId;

	@Column(name = "cat_id")
	private int catId;

	public int getBelongsId() {
		return belongsId;
	}

	public void setBelongsId(int belongsId) {
		this.belongsId = belongsId;
	}

	public int getServId() {
		return servId;
	}

	public void setServId(int servId) {
		this.servId = servId;
	}
	
	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}
	public BelongsTo() {
		super();

	}

}
