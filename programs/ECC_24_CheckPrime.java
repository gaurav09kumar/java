public class ECC_24_CheckPrime
{
	
	public static void main(String[] arg) {
		int num = 12;
		System.out.println(checkPrime(num));		
	}

	public static String checkPrime(int num)
	{
		
		if(num<0)
		{
			return "-1";
		}
		 else if(num==0 || num==1)
		 {
			 return "-2";
		 }
		 else 
		 {
			 if(num%2!=0)
			 {
			 while(num/1==num)
				 {
				 if(num/num==1)
				 {
					 return "true";
					 
				 }
				 } }
		 }return "false";
	}
	
}
			 
		 
			 
		
		 
		
	

