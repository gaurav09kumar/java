public class ECC_02_DigitChecker {
    public static void main(String[] args) {
        int num = 83;
        System.out.println(getDiffOfDigits(num));
    } 
    public static int getDiffOfDigits(int num) {
    	
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
    		int rem=num%10;
    		return 8-rem;
    		
    		}
	
    }
}
