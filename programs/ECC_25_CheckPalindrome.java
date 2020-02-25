public class ECC_25_CheckPalindrome
{

	public static void main(String[] arg) {
		int num = 123;
		System.out.println(checkPalindrome(num));
	}

	public static String checkPalindrome(int num)
	{
		if(num<0)
		{
			return "-1";
		}
		else if(num>=0 && num<=9)
		{
			
			return "-2";
		}
		else
		{
			int r,sum=0,temp;
			temp=num;
			while(num>0)
			
			{
				r=num%10;
				sum=(sum*10)+r;
				num=num/10;
			}
			if(temp==sum)
			{
				return "true";
			}
			return "false";
		}
			
		
		
	}
}
