package com.ofss.playground;

class Employee
{
	private int emdId;
	private String empName;
	private String empCity;
	
	// This is how you define constructor for Employee class
	// Default constructor, a constructor that doesn't receive any parameters/arguments
	// no-argument constructor
	public Employee()
	{
		System.out.println("Employee object is created....default constructor is called");
		// This is to setup the default values for all the properties
		this.emdId=1;
		this.empName="Guru";
		this.empCity="Bangalore";
	}
	
	// 2nd type of constructor - parametrized constructor
	public Employee(int empId, String empName, String empCity)
	{
		System.out.println("Parameterized constructor of Employee is called");
		this.emdId=empId;
		this.empName=empName;
		this.empCity=empCity;
		
	}
	
	public int getEmdId() {
		return emdId;
	}
	public void setEmdId(int emdId) {
		this.emdId = emdId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}



	public String toString() {
		return "Employee [emdId=" + emdId + ", empName=" + empName + ", empCity=" + empCity + "]";
	}
	
	
}


public class ConstructorDemo {

	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println(emp);
		
		Employee emp2=new Employee(5, "Raghu", "Mumbai");
		System.out.println(emp2);
	}
}
