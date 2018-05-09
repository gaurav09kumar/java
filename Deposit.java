package bank;

public class Deposit {
	int amount;
	int total=0;
	public int setDeposit(int amount) {
		this.amount=amount;
		System.out.println("Amount Deposited :"+amount);
		total=total+amount;
		System.out.println("Total Amount:"+total);
		return total;
	}
	public void display() {
		System.out.println("Enter the amount you want to deposit");
	}
}