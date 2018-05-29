package atm_demo;
import java.util.*;

public class Main_Demo {
	public void main() {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println();	
			System.out.println("WELCOME\nPress 1 for admin and 2 for Customer");
			int input=sc.nextInt();
			if(input==1) {
				Admin_ obj1=new Admin_();
				obj1.method();
			}
			else if(input==2) {
				Customer_ c=new Customer_();
				c.method_();
			}
			else 
			{
				System.out.println("Enter correct choice");
				main();
			}
		}catch (InputMismatchException e) {
			System.out.println("Please enter proper inputs");
			main();
		}
		catch(Exception e) {
			sc.close();
			System.out.println("Error occured");
			main();
		}
	}

}
