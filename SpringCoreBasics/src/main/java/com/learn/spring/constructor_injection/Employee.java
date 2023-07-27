package com.learn.spring.constructor_injection;

public class Employee {
	private int empId;
	private String empName;
	
	
	public Employee() {
	
	}


	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public void getEmployeeInfo() {
		System.out.println("EmployeeId:"+empId+" EmployeeName:"+empName);
	}
	
}
