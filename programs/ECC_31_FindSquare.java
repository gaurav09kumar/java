public class ECC_31_FindSquare
{

	public static void main(String[] arg) {
		int num = 3;
		System.out.println(getSquare(num));
	}

	public static int getSquare(int num)
	{
		if(num==0)
		{
			return -1;
		}
		else if(num<0)
		{
			return 0;
		}
		else 
		{
			int x;
			x=num*num;
			return x;
		}
	}
}
