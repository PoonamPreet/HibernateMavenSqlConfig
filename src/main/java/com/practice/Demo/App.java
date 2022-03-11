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
		Student_Details sd=new Student_Details();
		sd.setAge(12);
		sd.setFather_name("Deepak");
		sd.setMother_name("Hema");
		
		Student hib=new Student();
		hib.setId(101);
		hib.setLname("Poonam");
		hib.setFname("B");
		hib.setEmail("Email");
		hib.setDetails(sd);//need use object to save details of student details class

		Session session =sessionFactory.openSession();
		try {
			Transaction tx=session.beginTransaction(); 
			//hib=(Student)session.get(Student.class,101);//getting data from database
			session.save(hib);//to save data into db
			tx.commit();
			System.out.println(hib);

		}
		catch(Exception e){
			e.printStackTrace();   
		}

		session.close();
	}
}