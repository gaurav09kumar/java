package com;

public class ArrayIndexOutOfBoundsExceptionDemo {

	
	public static void main(String[] args) {
		
		/*try
		{
			int b[]=new int[-3];
		}
		catch(NegativeArraySizeException n)
		{
			n.printStackTrace();
		}
		System.out.println("end of the program");*/
	int a[]={2,5,6,7,8};
	try
	{
		a[5]=45;
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		ae.printStackTrace();
	}
	System.out.println("welcome");

	}

}
