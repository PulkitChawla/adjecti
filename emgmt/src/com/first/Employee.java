package com.first;

public class Employee {
	private int id;
	private String name;
	private double Salary;
	private String city;
	private String workDomain;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getWorkDomain() {
		return workDomain;
	}

	public void setWorkDomain(String workDomain) {
		this.workDomain = workDomain;
	}

	public Employee(int id, String name, double salary, String city, String workDomain) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.city = city;
		this.workDomain = workDomain;
	}

	public Employee() {
		super();
	}
}
