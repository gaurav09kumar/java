package genericsdemos;
import java.util.*;
public class New {
	public static <E> void printArray(E[] input) {
		for(E element : input) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String empName[]=new String[15];
		int empId[]=new int[15];
		String department[]=new String[15];
		double Salary[]=new double[15];
		double amount[]=new double[15];
		double finalSalary[]=new double[15];
		int records;
		int l=0;
		String s1="Employee Name";
		String s2="Employee Id";
		String s3="Department";
		String s4="Annual Income";
		String s5="Final Salary";
		
		System.out.println("Enter the number of records you want to add of an employee");
		records=sc.nextInt();
		
		for(int i=0;i<records;i++) {
			System.out.println("Enter employee name");
			empName[i]=sc.next();
			System.out.println("Enter employee Id");
			empId[i]=sc.nextInt();
			System.out.println("Enter the department");
			department[i]=sc.next();
			System.out.println("Enter the Employee salary per annum");
			Salary[i]=sc.nextDouble();
			String s[]= {empName[i],department[i]};
			Integer b[]= {empId[i]};
			Double d[]= {Salary[i]};
			
			if(i==records-1) {
				printArray(b);
				printArray(s);
				printArray(d);
			}
		}
	}

}