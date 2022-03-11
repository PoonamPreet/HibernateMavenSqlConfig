package com.practice.Demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="studentdetails")
public class Student {
	@Id
	private int id;
	//@Transient//takes off this field from DB
	private String fname;
	private String lname;
	//@Column(name="Studnet_Email")
	private String email;
	private Student_Details details;

	public Student_Details getDetails() {
		return details;
	}
	public void setDetails(Student_Details details) {
		this.details = details;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", details="
				+ details + "]";
	}
	
	
	
	}
