package com;

public class MultipleExceptionDemo {

	
	public static void main(String[] args) {
		
		int a=8,b,c;
		try
		{
			b=args.length;
			c=a/b;
			
			int id[]=new int[5];
			id[5]=123;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("some task executed");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("another task executed");
		}
		catch (Exception e) {
			System.out.println("common task executed");
		}
		System.out.println("end of the code executed");

	}

}
