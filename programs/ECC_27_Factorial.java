public class ECC_27_Factorial
{

	public static void main(String[] arg) {
		int num = 0;
		System.out.println(getFactorial(num));
	}

	public static int getFactorial(int num)
	{
		if(num<0)
		{
			return -1;
		}
		else if(num>0)
		{
			int fac=1;
			for(int i=1;i<=num;i++)
				{
				
				fac=i*fac;
				
				}
			return fac;
		}
		return -2;
	}
}
