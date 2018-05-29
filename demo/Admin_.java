package atm_demo;
import java.util.*;

public class Admin_ {
	public void method() {
		Scanner sc=new Scanner(System.in);
		Admin_ obj=new Admin_();
		try {
			System.out.println("Welcome admin\nSelect your options");
			System.out.println("1.Add new Customer");
			System.out.println("2.View All");
			System.out.println("3.View Customer");
			System.out.println("4.Exit");
			int choice=sc.nextInt();
			if(choice==1) {
				New_Customer n=new New_Customer();
				n.new_();
			}
			else if(choice==2) {
				ViewAll v=new ViewAll();
				v.viewall();
			}
			else if(choice==3) {
				View_One o=new View_One();
				o.one();
			}
			else if(choice==4) {
				Main_Demo obj1=new Main_Demo();
				obj1.main();
			}
			else {
				System.out.println("Enter the proper choice");
				method();
			}

		}
		catch(Exception e) {
			System.out.println("Enter valid inputs");
			obj.method();
			sc.close();
		}
	}
}
