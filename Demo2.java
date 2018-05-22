package employee;

public class Demo2{
	private double salary;

	public double getSalary() {
		double amount=(salary*3)/100;
		salary=salary-amount;
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}