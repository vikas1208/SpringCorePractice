package com.learn.spring.setter_injection;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	private int id;
	private String studentName;
	private Cheat cheat;

	public Student() {

	}

	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
		System.out.println("Constructor calling....");
	}

	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Cheat getCheat() {
		return cheat;
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void cheating() {
		cheat.cheating();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + "]";
	}

}
