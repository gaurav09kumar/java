
class ECC_08_OddRounder 
	{
	    public static void main(String[] args) 
	{
	        int num = 3;
	        
	System.out.println(oddRounder(num));
	   
	 }

	    public static int oddRounder(int num) {
	    
	if(num<0){

	return -1;
	}
	else if(num==0)
	{
	return -2;
	}
	else if(num%2==0){
	return num;
	}
	int x=num%10;
	    x = x + (10 - x % 10);



	    }

	} 




