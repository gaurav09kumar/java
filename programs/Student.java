package com;

class Student extends Person
{
	int id;
	String branch;
	Student(String name,int age,String gender,int id,String branch)
	{
		super(name,age,gender);
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.id=id;
		this.branch=branch;
		
	}
	public void getStudentDetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("gender="+gender);
		System.out.println("id="+id);
		System.out.println("branch="+branch);
	}
}