package oops_encapsulation_assignment;

import java.util.ArrayList;

public class Employee {
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	private char gender;
	ArrayList<Object> empdata=new ArrayList<Object>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public ArrayList<Object> getEmployeeInfo() {
		
		empdata.add(getName());
		empdata.add(getAge());
		empdata.add(getSalary());
		empdata.add(isActive());
		empdata.add(getGender());
		return empdata;
		
	}
	/*
	 * public Employee(String name, int age, double salary, boolean isActive, char
	 * gender) { this.name = name; this.age = age; this.salary = salary;
	 * this.isActive = isActive; this.gender = gender;
	 * 
	 * }
	 */
}
