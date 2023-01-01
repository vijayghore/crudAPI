package com.crudAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int rno;
	String name, grade, college;
	public Student(int rno, String name, String grade, String college) {
		super();
		this.rno = rno;
		this.name = name;
		this.grade = grade;
		this.college = college;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", grade=" + grade + ", college=" + college + "]";
	}
	
	

}
