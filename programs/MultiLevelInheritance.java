package com;
class Person
{
	String name;
	int age;
	String gender;
	
	public void setPersonDetails(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void getPersonDetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("gender"+gender);
	}
}
class Employee extends Person
{
	int id;
	float salary;
	public void setEmployeeDetails(String name,int age,String gender,int id,float salary)
	{
		
	}
}

public class MultiLevelInheritance {

	
	public static void main(String[] args) {
	

	}

}
