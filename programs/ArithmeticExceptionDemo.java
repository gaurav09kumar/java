package com;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		
		int a=6,b=0,c;
		try
		{
			c=a/b;
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}

	}

}
