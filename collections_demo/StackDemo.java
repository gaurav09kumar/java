package collectionsdemo;
import java.util.*;
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of objects you want to add");
		int a=sc.nextInt();
		for (int i=1;i<=a;i++) {
			System.out.println("Enter the "+i+" object");
			String z=sc.next();
			s.add(z);
			z=null;
		}
		System.out.println(s);
		sc.close();
	}
}