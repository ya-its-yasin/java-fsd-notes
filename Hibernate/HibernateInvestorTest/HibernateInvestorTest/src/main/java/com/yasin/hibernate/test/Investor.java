package com.yasin.hibernate.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Investor {

	@Id
	private int invesId;
	private String invesName;
	private String city;
	private double amount;
	public int getInvesId() {
		return invesId;
	}
	public void setInvesId(int invesId) {
		this.invesId = invesId;
	}
	public String getInvesName() {
		return invesName;
	}
	public void setInvesName(String invesName) {
		this.invesName = invesName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Investor(int invesId, String invesName, String city, double amount) {
		super();
		this.invesId = invesId;
		this.invesName = invesName;
		this.city = city;
		this.amount = amount;
	}
	
	public Investor() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Investor [invesId=" + invesId + ", invesName=" + invesName + ", city=" + city + ", amount=" + amount
				+ "]";
	}
	
	
	
}
