package com.prowings.introduction;

@Company
public class Employee {

	private int id;
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee Id :" + id);
		System.out.println("Employee Name :" + name);

	}

}
