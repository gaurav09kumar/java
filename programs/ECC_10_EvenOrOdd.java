public class ECC_10_EvenOrOdd {
    public static void main(String[] args) {
        int num = 44;
        System.out.println(isEvenOrOdd(num));
    }

    public static String isEvenOrOdd(int num) {
       if (num<=0)
       {
    	   return "Invalid Input";
       }
       if (num%2==0)
       {
    	   return "Even";
       }
       else
       {
    	   return "Odd";
       }
    }
}
