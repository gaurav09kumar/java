package employee;
import java.util.*;
public class Main_ {
	public void method() {
		Main_ m1=new Main_();
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Choose your option");
		System.out.println("1 : ADD");
		System.out.println("2 : DELETE");
		System.out.println("3 : VIEW");
		
		int choice=sc.nextInt();
		if(choice==1) {
			Demo1 object=new Demo1();
			object.details();
		}
		else if(choice==2) {
			Delete d=new Delete();
			d.d();
		}
		else if(choice==3)
		{
			View v=new View();
			v.v();
		}
		else
		{
			System.out.println("Enter a valid choice");
			m1.method();
		}
		
	}catch(InputMismatchException e) {
		System.out.println("Please enter a valid choice");
		m1.method();
		
	}
		catch(Exception e) {
			e.printStackTrace();
			m1.method();
		}
}
}
