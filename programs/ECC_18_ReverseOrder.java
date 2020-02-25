public class ECC_18_ReverseOrder {

	public static void main(String[] arg) {
		int start_val = 40;
		int end_val = 20;
		System.out.println(getNumbersInRange(start_val, end_val));
	}

    public static String getNumbersInRange(int s_val, int e_val) {
	String i=" ";
	if(s_val<0 || e_val<0)
	{
		return "-1";
	}
	else if(s_val==e_val)
	{
		return "-2";
	}
	else if(s_val<e_val && e_val-s_val==1 )
	{
		return "-4";
	}
	else if(s_val<e_val )
		{	return "-3";
		
		}
	else
	
	{
	while(s_val>e_val-1)
	{
		s_val--;
		i=i+s_val+" ";
				
			
			
	
	}
	 
		
	}
	return i.trim();
    }
}

	





