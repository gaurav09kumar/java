public class ECC_28_ListFactors {
    public static void main(String[] args) {
        int num = 284;
        System.out.println(getFactors(num));
    }
	public static String getFactors(int num) {
		String j=" ";
		if(num<0)
		{
			return "-1";
		}
		else if(num>0)
		{
			
			for(int i=0;i<=num;i++)
			{
				int x=0;
				if(num%i==0)
				{
					x=x+i;
					j=j+" ";
				
				}
				
			}
		}j=j.trim();
		return j;
		
		
	}
}
