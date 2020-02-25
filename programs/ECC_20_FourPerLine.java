public class ECC_20_FourPerLine
{

	public static void main(String[] arg) {
		int num = 4;
		System.out.println(getFourPerLine(num));
	}

	public static String getFourPerLine(int num)
	{
		String j=" ";
		if (num<0)
		{
			return "-1";
		}
		else if (num==0)
		{
			return "-2";
		}
		else if(num>99)
		{
			return "-3";
		}
		else 
		{
			for(int i=0;i<=num;i++)
				j=i + " ";
		}
		j=j.trim();
		return j;
	}
}



//Value must not be negative. If yes, then return -1 as string.                        

//Value must not be 0. If yes, then return -2 as string.                              

//Value must not be greater than 99. If yes, then return -3 as string.

//Numbers in range must be returned as one string with every value separated by single blankspace.

//Ensure a new line after every set of 4 values.

//For Example:
//In Input: 12
//Output:
//1 2 3 4 
//5 6 7 8
//9 10 11 12 /*