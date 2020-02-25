public class ECC_17_NumbersInRange
{

	public static void main(String[] arg) {
		int num1 = 20;
		int num2 = 10;
		System.out.println(getNumbersInRange(num1, num2));
	}

	
	public static String getNumbersInRange(int num1,int num2)
	{
		String j="";
		if(num1<0 || num2<0)
		{
			return "-1";
		}
		else if(num1==num2)
		{
			return "-2";
		}
		else if(num1<num2)
		{
			return "-3";
		}
		else if (num1>num2){
			
			while(num1>num2)
			{
			j=j+num1;
			System.out.println(j);
			}
			
				
				
		}
		return null;
	}
}
