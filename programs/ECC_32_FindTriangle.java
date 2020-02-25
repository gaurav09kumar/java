public class ECC_32_FindTriangle
{

	public static void main(String[] arg) {
		int num1 = 3;
		int num2 = 3;
		int num3 = 4;
		System.out.println(findTriangle(num1, num2, num3));
	}

	public static String findTriangle(int num1,int num2,int num3)
	{
		if(num1*num2==0 || num2*num3==0)
		{
			return "-1";
		}
		else if(num1<0 || num2<0 || num3<0)
		{
			return "-2";
		}
		else if(num1+num2<num3 || num2+num3<num1 || num1+num3<num2) 
		{
		return "-3";
		}
		else
		{
			if(num1==num2 && num2==num3 )
			{
				return "EQUILATERAL";
			}
			else if(num1==num2 || num2==num3 || num3==num1)
			{
				return "ISOSCELES";
			}
			else
			{
				return "SCALENE";
			}
		}
		
	}
}
