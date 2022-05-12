package com.edubridge.hybernate.valuetype;

import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Configuration cfg = new Configuration();
			System.out.println("2222222222222222222222222222");
			cfg.configure("Hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			System.out.println("4444444444444444444444444");
			// creating session object
			Session session = factory.openSession();
			// Session session=new
			// AnnotationConfiguration().configure().buildSessionFactory().openSession();

			Transaction t = session.beginTransaction();
			Address address = new Address();
			address.setCity("Bangalore");
			address.setState("Tamilnadu");
			address.setPincode("632602");
			address.setStreet("cross street");
			UserDetails userdetails=new UserDetails();
			userdetails.setPhone("746573624572");
			userdetails.setUserId(1);
			userdetails.setUserName("sasirekha");
			userdetails.setdob(new Date());
			userdetails.setAddress(address);
			session.save(userdetails);
			t.commit();
			
		    session.close();
		System.out.println("successfully saved");
	}catch(

	Exception ex)
	{
		System.out.println("exception " + ex.getMessage());
	}

}
}