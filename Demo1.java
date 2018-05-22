package employee;
import java.util.*;

class A<T>{
	private T t;

	public T get(){
		return this.t;
	}

	public void set(T t1){
		this.t=t1;
	}
}


public class Demo1{
	public static void main(String[] args) {
		int f = 0;
		while (f == 0) {
			int c = 0;
			int l = 0;
			String s1;
			List al = new ArrayList();
			Scanner sc = new Scanner(System.in);
			Data obj1=new Data();
			Demo2 obj2=new Demo2();
			A <String>object1=new A<>();
			A <Integer>object2=new A<>();
			A <Double>object3=new A<>();
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
					obj1.setEmpName(s1);
					obj1.setEmpId(s2);
					obj1.setEmpDep(s3);
					obj1.setAnnualIncome(s4);
					obj2.setSalary(s4);
					
					object1.set(obj1.getEmpName());
					al.add(object1.get());
					object2.set(obj1.getEmpId());
					al.add(object2.get());
					object1.set(obj1.getEmpDep());
					al.add(object1.get());
					object3.set(obj1.getAnnualIncome());
					al.add(object3.get());
					object3.set(obj2.getSalary());
					al.add(object3.get());
					

					System.out.println("Do you want to continue \n press 1 for yes and 0 for no");
					c = sc.nextInt();
				} while (c != 0);

				System.out.println("Thankyou for entering the data");
				System.out.println("--------------------------------");
				Iterator itr = al.iterator();
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