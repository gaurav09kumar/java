public class ECC_30_EvenNumberTester
{

	public static void main(String[] arg) {
		int num1 = 30;
		int num2 = 10;
		System.out.println(getEvenNumbers(num1, num2));
	}

	public static String getEvenNumbers(int num1,int num2)
	{
		if(num1<0 || num2<0 )
		{
			return "-1";
		}
		else if(num1*num2==0 || num1==num2)
		{
			return "-2";
		}
		else
		{
			int x;
			String r="";
			if(num1>num2){
			x=num2;
			num2=num1;
			num1=x;
			}
			for(int i=num1;i<=num2;i++)
			{
				if(i%2==0)
				{
					r=r+i+" ";
				}
				
			}
			r=r.trim();
			return r;
	
		
		}
		}

}