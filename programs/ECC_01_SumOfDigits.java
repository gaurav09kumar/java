
public class ECC_01_SumOfDigits {
	
	    public static void main(String[] args) {
	        int num = 67;
	        System.out.println(getSumOfDigits(num));
	    }

	    public static int getSumOfDigits(int num)	{
	    	if(num<0){
	    		return -3;
	    	}
	    	else if (num>99){
	    		return -2;
	    	}
	    	else if(num>=0 && num<=9){
	    		return -1;
	    	}
	    	else{
	    		return 7;
	    		}
	       
	    }
	}
