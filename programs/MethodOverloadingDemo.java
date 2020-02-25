package com;
class Addition
{
	int add(int a,int b)
	{
		return (a+b);
	}
	int add(int a ,int b,int c)
	{
		return a+b+c;
	}
	float add(int a ,float b)
	{
		return (a+b);
	}
}
public class MethodOverloadingDemo {
	public static void main(String [] args)
	{
	Addition a=new Addition();
	int x=a.add(4,5);
	int y=a.add(5,4,6);
	float z=a.add(5,4.5f);
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);

}
}
