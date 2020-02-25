package com;

public class StringIndexOutOfBoundException {

	
	public static void main(String[] args) {
	
		/*String name="raju";
		try
		{
			System.out.println(name.charAt(4));
		}
		catch(StringIndexOutOfBoundsException se)
		{
			se.printStackTrace();
		}
System.out.println("welcome");*/
		
		
	/*	String name ="raju";
		int n=0;
		try
		{
			n=Integer.parseInt(name);
		}
		catch(NumberFormatException nf)
		{
			nf.printStackTrace();
		}
		System.out.println("welcome");
		*/
		
		String name=null;
		try
		{
			System.out.println(name.length());
		}
		catch (NullPointerException ne)
		{
			ne.printStackTrace();
		}
		System.out.println("welcome");
	}

}
