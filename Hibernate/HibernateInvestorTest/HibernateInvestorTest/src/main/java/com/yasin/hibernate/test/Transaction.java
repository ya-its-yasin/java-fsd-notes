package com.yasin.hibernate.test;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	private int transId;
	private Date transDate;
	private double transAmt;
	private int investorId;
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public double getTransAmt() {
		return transAmt;
	}
	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}
	public int getInvestorId() {
		return investorId;
	}
	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public Transaction(int transId, Date transDate, double transAmt, int investorId) {
		super();
		this.transId = transId;
		this.transDate = transDate;
		this.transAmt = transAmt;
		this.investorId = investorId;
	}
	@Override
	public String toString() {
		return "\n Transaction [transId=" + transId + ", transDate=" + transDate + ", transAmt=" + transAmt
				+ ", investorId=" + investorId + "]";
	}
	
}
