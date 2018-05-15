package genericsdemos;
import java.util.*;
public class Auto_BoxingDemo {
/*
 * Converting a primitive value (an int, for example) 
 * into an object of the corresponding wrapper class (Integer) 
 * is called auto boxing
 */
	public static void main(String[] args) {
	List<Integer> li = new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("how many numbers you want to add to the ArrayList:");
	try {
		int a=sc.nextInt();
		for (int i=1;i<=a;i++) {
			System.out.println("Enter the "+i+" element:");
			int c=sc.nextInt();
			li.add(c);
		}
		System.out.println(li);
		sc.close();
		}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}