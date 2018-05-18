package example;

import java.util.*;

public class Imp {
	private String empName;
	private int empId;
	private String empDep;
	private double annualIncome;

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	private double finalSalary;

	public double getFinalSalary() {
		return finalSalary;
	}

	public void setFinalSalary(double finalSalary) {
		this.finalSalary = finalSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpDep() {
		return empDep;
	}

	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}

	public static void main(String[] args) {
		int f = 0;
		while (f == 0) {
			int c = 0;
			int l = 0;
			String s1;
			List list = new ArrayList();
			Scanner sc = new Scanner(System.in);
			Imp obj = new Imp();
			try {
				do {
					System.out.println();
					System.out.println("-------------------------");
					System.out.println();
					System.out.println("Enter the employee data");
					System.out.println();
					do {
						System.out.println("Enter employee name");
						s1 = sc.next();
						char a = s1.charAt(0);
						if (a >= '0' && a <= '9') {
							System.out.println("Enter proper name");
							l = l + 1;
						} else {
							l = 0;
						}
					} while (l != 0);
					System.out.println("Enter employee Id");
					int s2 = sc.nextInt();
					System.out.println("Enter employee department");
					String s3 = sc.next();
					System.out.println("Enter annual income");
					double s4 = sc.nextDouble();
					obj.setEmpName(s1);
					obj.setEmpId(s2);
					obj.setEmpDep(s3);
					obj.setAnnualIncome(s4);
					double amount = (3 * s4) / 100;
					s4 = s4 - amount;
					obj.setFinalSalary(s4);
					list.add(obj.getEmpName());
					list.add(obj.getEmpId());
					list.add(obj.getEmpDep());
					list.add(obj.getAnnualIncome());
					list.add(obj.getFinalSalary());

					System.out.println("Do you want to continue \n press 1 for yes and 0 for no");
					c = sc.nextInt();
				} while (c != 0);

				System.out.println("Thankyou for entering the data");
				System.out.println("--------------------------------");
				Iterator itr = list.iterator();
				int count = 0;
				System.out.format("%20s%20s%20s%20s%20s", "Employee Name", "Employee Id", "Department", "Annual Income",
						"Final salary");
				System.out.println();
				while (itr.hasNext()) {
					count = count + 1;
					if (count != 6) {
						System.out.format("%20s", itr.next());
					} else {
						System.out.println();
						count = 0;
					}
				}
			} catch (Exception e) {
				f = 0;
				System.out.println("Enter proper valid inputs");
			}
		}
	}
}