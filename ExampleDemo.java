package genericsdemos;
import java.util.Scanner;
public class ExampleDemo {
	public static void main(String[] args) {
		
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
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter the number of records you want to add");
		records=sc.nextInt();
		
		for(int i=0;i<records;i++) {
			System.out.println("Enter the data of record "+(i+1));
			System.out.println("--------------------------");
			
			
			do {
			System.out.println("Enter employee name");
			empName[i]=sc.next();
			char a=empName[i].charAt(0);
			if(a>='0' && a<='9') {
				System.out.println("Enter proper name");
				l=l+1;
				}
			else
			{
				l=0;
			}
			}while(l!=0);
			
			
			
			System.out.println("Enter the employee Id");
			empId[i]=sc.nextInt();
			
			
			
			
			do {
				System.out.println("Enter the department of Employee");
			department[i]=sc.next();
			final char a=empName[i].charAt(0);
			if(a>='0' && a<='9') {
				System.out.println("Enter proper name");
				l=l+1;
			}
			else
			{
				l=0;
			}
			}while(l!=0);
			
			
			System.out.println("Enter the employee salary");
			Salary[i]=sc.nextDouble();
			amount[i]=(3*Salary[i])/100;
			finalSalary[i]=Salary[i]-amount[i];
			}
		System.out.format("%20s%20s%20s%20s%20s",s1,s2,s3,s4,s5);
		System.out.println();
		
		for(int j=0;j<records;j++) {
			System.out.format("%20s%20s%20s%20s%20s",empName[j],empId[j],department[j],Salary[j],finalSalary[j]);
			System.out.println();
		}
		sc.close();
		System.out.println();
		System.out.println("Thankyou for entering the data");
	}
	catch(Exception e){
		System.out.println("Enter proper valid input");
		sc.close();
	}
	}
}