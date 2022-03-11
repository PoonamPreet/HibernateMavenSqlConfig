package com.practice.Demo;

import javax.persistence.Embeddable;

@Embeddable//used to concatenate all details in one table
public class Student_Details {

	private String father_name;
	private String mother_name;
	private int age;
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student_Details [father_name=" + father_name + ", mother_name=" + mother_name + ", age=" + age + "]";
	}
}
