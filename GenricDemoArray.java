package genericsdemos;
import java.util.*;
public class GenricDemoArray {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(125);
		al.add(565);
		System.out.println(al);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of objects you want to add");
		try{
			int s=sc.nextInt();
			for (int i=1;i<=s;i++) {
				System.out.println("enter the "+i+" value");
				int b=sc.nextInt();
				al.add(b);
			}
			System.out.println(al);
			sc.close();
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("please enter an integer");
		}
		
	}
}
