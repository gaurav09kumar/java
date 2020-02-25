package com;
class Person
{
	String name;
	int age;
	String gender;
	
	Person(String name,int age,String gender)
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