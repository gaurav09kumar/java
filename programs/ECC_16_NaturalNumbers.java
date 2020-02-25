public class ECC_16_NaturalNumbers
{

	public static void main(String[] arg) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(getNaturalNumbers(num1, num2));
	}

	public static String getNaturalNumbers(int num1,int num2)
	{
		String j="";
		if(num1<0 || num2<0)
		{
			return "-1";
		}
		else if(num1*num2==0)
		{
			return "-2";
		}
		else if (num1>0 && num2>0)
		{
			
			while(num1<num2)
			{
				j=j+" "+num1;
				num1++;
			}
			return j;
		}
		return null;
	}
}
