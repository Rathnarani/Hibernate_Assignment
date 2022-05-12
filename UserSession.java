package com.edubridge.hybernate.valuetype;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserSession {
	
		
		public static Session getSession()
		{
			Configuration cfg=new Configuration();
			 cfg.configure("Hibernate.cfg.xml");
			 SessionFactory factory=cfg.buildSessionFactory();  
			 Session session=factory.openSession(); 
			 return session;
		}

	}
