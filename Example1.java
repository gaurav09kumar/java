package learning;
import java.util.Scanner;
public class Example1 {
	void display() {
	System.out.println("Please select any one option:");
	System.out.println("1:Deposit");
	System.out.println("2:Balance");
	System.out.println("3:Withdraw");
	System.out.println("4:exit");
	}
	public static void main(String[]args) {
		
		int total=0;
		int amount=0;
		Example1 e1=new Example1();
		Scanner s = new Scanner(System.in);
		int num;
		do {
			e1.display();
			num=s.nextInt();
		if(num==1) {
			System.out.println("Enter the amount you want to deposit");
			amount=s.nextInt();
			total=total+amount;
			System.out.println("Amount deposited "+total);
		}
		else if(num==2) {
			System.out.println("Your balance is "+total);
		}
		else if(num==3) {
			System.out.println("Enter the amount you want to withdraw");
			amount=s.nextInt();
			if(amount<=total) {
				total=total-amount;
				System.out.println("remaining balance "+total);
			}
			else
			{
				System.out.println("Sorry insuffcient balance");	
			}
		}
	}while(num!=4);
		System.out.println("exited");
		s.close();
}
}
