public class ECC_19_RangeWithStep {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 20;
        int step = 2;
        System.out.println(getNumbersInRange(n1, n2, step)); 
    }
	public static String getNumbersInRange(int num1, int num2, int step) {
		//String i=" ";
	    if(num1<0 || num2<0  || step<0)
	    {
	    	return "-1";
	    }
	    else if(num1==num2 || num2==step || step==num1)
	    {
	    	return"-2";
	    }
	    else if(num1>num2)
	    {
	    	return "-3";
	    }
	    else
	    {
	    //	while(num1<num2)
	    		
	    	//{
	    		//i=;
	    	//	return i;
	    	//}
	   // }
return null;
	}
	}
}


//Values must not be negative. If yes, then return -1 as string.                      

//Values must not be same. If yes, then return -2 as string.                          

//1st value must not be greater than 2nd value. If yes, then return -3 as string.      

//Numbers in range must not include start and end value.                                      

//Numbers in range must be returned as one string with every value separated by single blankspace.

//For Example:
//If input values are 10 30 2
//Output: 11 13 15 17 19 21 23 25 27 29