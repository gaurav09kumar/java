package learning;
import java.util.Scanner;
import bank.*;
public class Atm{
	void display1() {
		System.out.println("Please select any one option:");
		System.out.println("1:Deposit");
		System.out.println("2:Balance");
		System.out.println("3:Withdraw");
		System.out.println("4:exit");
	}
	public static void main(String[]args) {
		int amount=0;
		int totalAmount=0;
		Atm a1=new Atm();
		Deposit d1=new Deposit();
		Balance d2=new Balance();
		Withdraw w=new Withdraw();
		Scanner s=new Scanner(System.in);
		int num=0;
		do {
			a1.display1();
			num=s.nextInt();
			if(num==1) {
				d1.display();
				amount=s.nextInt();
				totalAmount=(int)d1.setDeposit(amount);
				}
			else if(num==2) {
				d2.balance(totalAmount);
			}
			else if(num==3) {
				w.display();
				amount=s.nextInt();
				totalAmount=(int)w.withDraw(totalAmount, amount);
			}
			
		}while(num!=4);
		System.out.println("exited");
		s.close();
	}
}