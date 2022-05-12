package com.edubridge.hybernate.valuetype;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LoadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=UserSession.getSession();
	    Transaction t=session.beginTransaction(); 
	    UserDetails userDetails=session.load(UserDetails.class,1);
	    System.out.println(userDetails.getUserName());
	    System.out.println(userDetails.getPhone());
	    System.out.println(userDetails.getDob());
	    System.out.println(userDetails.getAddress().getCity());
	    System.out.println(userDetails.getAddress().getState());
	    System.out.println(userDetails.getAddress().getPincode());
	    t.commit();
	    session.close();}
	}