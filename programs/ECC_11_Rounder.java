public class ECC_11_Rounder {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(calculate(num));
    }

    public static int calculate(int num) {
       if (num<=0)
       {
    	  return -1;
       }
       else if(num%2==0)
       {
    	   return num=num*num;
       }
       else
       {
    	   return num=num*num*num;
       }
    }

}
