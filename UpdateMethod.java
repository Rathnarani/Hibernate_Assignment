package com.edubridge.hybernate.valuetype;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=UserSession.getSession();
	    Transaction t=session.beginTransaction(); 
	    UserDetails userdetails=new UserDetails();
		userdetails.setPhone("746573624572");
		userdetails.setUserId(1);
		userdetails.setUserName("sasirekha");
		userdetails.setdob(new Date());
		session.update(userdetails);
		userdetails.setUserName("murali");
		t.commit();
		System.out.println("updated successfully");
		session.close();
		
	}


	}