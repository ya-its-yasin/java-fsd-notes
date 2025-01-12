package com.yasin.hibernate.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;


public class InvestorTransaction {

	List<Investor> in = new ArrayList<>();
	List<Transaction> tr = new ArrayList<>();
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	public boolean addInvestor(Investor i)
	{
		Session session = factory.openSession();
		org.hibernate.Transaction str = session.beginTransaction();
		
		if(!isValidInvestor(i.getInvesId()))
		{
			session.save(i);
			str.commit();
			System.out.println("Inverstor " + i.getInvesId() + " added successfully");
			return true;
		}
		session.close();
		return false;
	}
	
	public boolean addTransaction(Transaction t)
	{
		Session session = factory.openSession();
		org.hibernate.Transaction str = session.beginTransaction();
		
		if(isValidInvestor(t.getInvestorId()))
		{
			System.out.println("Transaction " + t.getTransId() + " added successfully");
			session.save(t);
			str.commit();
			return true;
		}
		session.close();
		return false;
	}

	private boolean isValidInvestor(int investorId) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		org.hibernate.Transaction str = session.beginTransaction();
		
		in = (ArrayList<Investor>) session.createQuery("SELECT a FROM Investor a", Investor.class).getResultList();
		for(Investor ins : in)
		{
			if(ins.getInvesId()==investorId)
			{
				session.close();
				return true;
			}
		}
		session.close();
		return false;
	}

	public void listAllTransactions(int invesId) {
		// TODO Auto-generated method stub
		System.out.print("inside my method");
		Session session = factory.openSession();
		org.hibernate.Transaction trans = session.beginTransaction();
		
		org.hibernate.query.Query<Transaction> qry = session.createQuery("FROM Transaction WHERE investorId = :param1", Transaction.class);
		qry.setParameter("param1", invesId);
		
		tr = qry.getResultList();
		
		System.out.print(tr.toString());
		
		trans.commit();
		session.close();
		
	}
	
}














