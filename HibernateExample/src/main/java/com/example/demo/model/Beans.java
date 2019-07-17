package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Beans {

	@Id
	private int id;
	private String rfn;
	private String storeNo;
	private int regNo;
	private String date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRfn() {
		return rfn;
	}

	public void setRfn(String rfn) {
		this.rfn = rfn;
	}

	public String getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Beans [id=" + id + ", rfn=" + rfn + ", storeNo=" + storeNo + ", regNo=" + regNo + ", date=" + date
				+ "]";
	}

}
