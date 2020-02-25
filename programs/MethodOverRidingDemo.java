package com;
class Bank
{
	float getRateOfIntrest()
	{
		return 0.1f;
	}
	
}
class SBI extends Bank
{
	float getRateOfIntrest()
	{
		return 0.4f;
	}
}
class ICICI extends Bank
{
	float getRateOfIntrest()
	{
		return 0.56f;
	}
}
class HDFC extends Bank
{
	float getRateOfIntrest()
	{
		return 0.75f;
	}
}
public class MethodOverRidingDemo {

	public static void main(String[] args) {
		Bank sbi=new SBI();
		System.out.println(sbi.getRateOfIntrest());
		Bank icici=new ICICI();
		System.out.println(icici.getRateOfIntrest());
		Bank hdfc=new SBI();
		System.out.println(hdfc.getRateOfIntrest());
		
		
	}

}
