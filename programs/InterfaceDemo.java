package com;
interface Speaker
{
	void speak();
}

class Politician implements Speaker
{
	public void speak()
	{
		System.out.println("Politician talks about politics");
		
	}
	void display()
	{
		System.out.println("in display()");
	}
}

class Priest implements Speaker
{
	public void speak()

{
System.out.println("Priest talks abou god");	
}
}
	
	class lecturer implements Speaker
	{
		public void speak()
		{
			System.out.println("lecturer teaches the subjects");
		}
	}
	

public class InterfaceDemo {
	public static void main(String[] args)
	{
		Speaker s;
		Politician p=new Politician();
		s=p;
		s.speak();
		
		s=new Priest();
		s.speak();
		
		
		s=new lecturer();
		s.speak();
		
	}

}
