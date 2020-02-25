public class ECC_26_CheckArmStrong {
	
	public static void main(String[] arg) {
		int num = 1634;
		System.out.println(checkArmStrong(num));
	}

	public static String checkArmStrong(int num) {
		int sum=num;
		if(num<0)
		{
			return "-1";
		}
		else if(num>0 && num<1000)
		{
			return "-2";
		}
		else
		{
			int r1,r2,r3,r4,r5; 
			r1=num%10;
			num=num/10;
			r2=num%10;
			num=num/10;
			r3=num%10;
			num=num/10;
			r4=num/10;
			r5=(r1*r1*r1*r1)+(r2*r2*r2*r2)+(r3*r3*r3*r3)+(r4*r4*r4*r4);
				if(sum==r5)
				{
					return "ArmStrong Number";
				}
		return "Not ArmStrong Number";
	}
}
		
}