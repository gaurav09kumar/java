public class ECC_12_SumOfMul10 {
    public static void main(String[] args) {
        int a = 23, b = 34, c = 69;
        System.out.println(sumOfMultiples(a, b, c));
    }

    public static int sumOfMultiples(int a, int b, int c) {
        if (a<=0 | b<=0 | c<=0)
        {
        	return -1;
        }
        
        else 
        {
        	if(a%10==0)
        	{
        		return a;
        	}
        	else return (a+1)*10;
        	
        	
        }
    }
}
				