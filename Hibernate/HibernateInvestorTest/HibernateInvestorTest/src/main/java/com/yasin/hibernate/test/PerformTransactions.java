package com.yasin.hibernate.test;

import java.util.Date;

public class PerformTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvestorTransaction it = new InvestorTransaction();
		
	Investor i = new Investor(102,"hagin", "bodi", 150000);
	System.out.println("investor staus -> " + it.addInvestor(i));
	
	Transaction t1 = new Transaction(2,new Date(2023,12,31),5000,103);
	System.out.println(" transaction status -> " + it.addTransaction(t1));
	
	Transaction t2 = new Transaction(3,new Date(2023,12,31),15000,102);
	System.out.println(" transaction status -> " + it.addTransaction(t2));
	Transaction t3 = new Transaction(4,new Date(2023,12,31),25000,102);
	System.out.println(" transaction status -> " + it.addTransaction(t3));
	Transaction t4 = new Transaction(5,new Date(2023,12,31),35000,102);
	System.out.println(" transaction status -> " + it.addTransaction(t4));
		
		
		it.listAllTransactions(i.getInvesId());

	}

}
