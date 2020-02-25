public class ECC_33_ListPrimes
{

	public static void main(String[] arg) {
		int num1 = 20;
		int num2 = 30;
		System.out.println(getPrimeNumbers(num1, num2));
	}

	public static String getPrimeNumbers(int num1,int num2)
	{
		String j=" ";
		if(num1<0 || num2<0)
		{
			return "-1";
		}
		else if(num1>=num2)
		{
			return "-2";
		}
		else
		{int count=0;
			
			for(int i=num1;i<num2/2;i++)
			{
				for(int k=1;k<=i;k++)
				{
					if(i%k==0)
					{
						count++;
					}
				}
				if(count==0)
				{
					j=j+i+" ";
				count=0;
				}
			}
		}j=j.trim();
		return j;
	}
}
