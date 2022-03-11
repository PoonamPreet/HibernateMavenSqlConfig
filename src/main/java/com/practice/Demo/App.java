package com.practice.Demo;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.net.ssl.ExtendedSSLSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import javassist.bytecode.stackmap.BasicBlock.Catch;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) 
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

		Student hib=new Student();
		hib.setId(102);
		hib.setLname("Poonam");
		hib.setFname("Tilak");
		hib.setEmail("Email");

		Session session =sessionFactory.openSession();
		try {
			Transaction tx=session.beginTransaction(); 
			session.save(hib);
			tx.commit();

		}
		catch(Exception e){
			e.printStackTrace();   
		}

		session.close();
	}
}