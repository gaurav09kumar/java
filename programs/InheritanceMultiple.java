package com;

class Person
{
	String name;
	int age;
	String gender;
	
	public void  setPersonDetails(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void getPersonDetails()
	{
		System.out.println("Name="+name);
		System.out.println("age="+age);
		System.out.println("gender="+gender);
	}
}
	 class Employee extends Person
	 {
	 	
	 	int id;
	 	float salary;
	 	
	 	public void  setEmployeeDetails(String name,int age,String gender,int id,float salary)
	 	{
	 		
	 		setPersonDetails(name, age, gender);
	 		this.id=id;
	 		this.salary=salary;
	 	}
	 	public void getEmployeeDetails()
	 	{
	 		
	 	getPersonDetails();
	 		System.out.println("id="+id);
	 		System.out.println("salary="+salary);
	 		
	 	}
	 }
	 
	 
	 class Supervisor extends Employee
	 {
	 	
	 	int personsUnder;
	 	float incentives;
	 	
	 	public void  setSupervisorDetails(String name,int age,String gender,int id,float salary,int personsUnder,float incentives )
	 	{
	 		
	 		setEmployeeDetails(name, age, gender, id, salary);
	 		this.personsUnder=personsUnder;
	 		this.incentives=incentives;
	 	}
	 	public void getSupervisorDetails()
	 	{
	 		
	 		getEmployeeDetails();
	 	
	 		System.out.println("PersonsUnder="+personsUnder);
	 		System.out.println("incentives="+incentives);
	 		
	 	}
	 }
	 
	 
	 
	 
	

public class InheritanceMultiple {

	public static void main(String[] args) {
		
		
		Supervisor s=new Supervisor();
    s.setSupervisorDetails("Abc", 18, "Male", 300 , 37467788.00f, 36,439998765.00f);
    s.getSupervisorDetails();

	}

}
