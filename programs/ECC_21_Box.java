public class ECC_21_Box
{
	public static void main(String[] args) {
		int rows = 2;
		int cols = 3;
		System.out.println(createBoxPattern(rows, cols));
	}



	public static String createBoxPattern(int rows,int cols)
	{
		if(rows==0 || cols==0)
		{
			return "-1";
		}
		else if(rows<0 || cols<0)
		{
			return "-2";
		}
		else
		{
			//for(int i;i<=rows;i++)
			//{
				for(int spaces=1;spaces<rows-1;spaces++)
				{
					return " "+"*";
				}
				
			//}
		}
		return null;
	}
}
