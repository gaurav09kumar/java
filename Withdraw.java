package bank;

public class Withdraw {
	int amount;
	int total;
	public void display() {
		System.out.println("Enter the amount you want to withdraw");
	}
	public int withDraw(int total,int amount) {
		this.amount=amount;
		this.total=total;
		if(total>=amount) {
			total=total-amount;
			System.out.println("You have withdrawn "+amount);
			System.out.println("remaining balance "+total);
		}
		else {
			System.out.println("Sorry insuffcient balance");
		}
		return total;
	}
}
