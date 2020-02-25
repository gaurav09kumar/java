
public class AddDemo {

	public static void main(String[] args) {
		int firstNumber=25 , secondNumber=4 , sum , difference , product, remainder , quotient ;
		sum = firstNumber + secondNumber ;
		System.out.println("sum="+sum);
		
	    difference = firstNumber - secondNumber; 
		System.out.println("difference="+difference);
		
		product =  firstNumber * secondNumber; 
		System.out.println("product="+product);
		
		quotient = firstNumber / secondNumber ;
		System.out.println("quotient="+quotient);
		
		remainder = firstNumber % secondNumber ;
		System.out.println("remainder="+remainder);
		
		float n1=7f , n2=5f , n3 ;
		n3=n1 / n2;
		System.out.println("n3="+n3);
    
		int n=653;
		System.out.println(n%10);
		System.out.println(n/10);
	}

}
