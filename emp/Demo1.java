package employee;
import java.sql.*;
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
	public void details() {
		Main_ m=new Main_();
			int c = 0;
			int l = 0;
			String s1=null;
			int s2=0;
			String s3=null;
			double s4=0;
			List al = new ArrayList();
			Scanner sc = new Scanner(System.in);
			Data obj1=new Data();
			Demo2 obj2=new Demo2();
			A <String>object1=new A<>();
			A <Integer>object2=new A<>();
			A <Double>object3=new A<>();
			try {
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
					try {
					System.out.println("Enter employee Id");
					s2 = sc.nextInt();
					}catch(Exception e) {
						System.out.println("Enter proper valid inputs");
						m.method();
					}
					try {
					System.out.println("Enter employee department");
					s3 = sc.next();
					}catch(Exception e) {
						System.out.println("Enter proper valid inputs");
						m.method();
					}
					try {
					System.out.println("Enter annual income");
					s4 = sc.nextDouble();
					}catch(Exception e) {
						System.out.println("Enter proper valid inputs");
						m.method();
					}
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

				System.out.println("Thankyou for entering the data");
				System.out.println("--------------------------------");
				/*Iterator itr = al.iterator();
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
				}*/
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
					PreparedStatement ps=con.prepareStatement("select id from employee");
					ResultSet rs=ps.executeQuery();
					
					while(rs.next()) {
						if(s2==rs.getInt(2));
						{
							System.out.println();
							System.out.println();
							System.out.println("ID already exists in the database");
							System.out.println("Please enter a different ID");
							m.method();
						}
					}
					}catch(Exception e) {
					System.out.println("Cannot connect to database");
					m.method();
				}
				try {
					System.out.println();
					System.out.println("ADDING TO DATABASE....");
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
					PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
					ps.setString(1, s1);
					ps.setInt(2, s2);
					ps.setString(3, s3);
					ps.setDouble(4, s4);
					ps.setDouble(5, obj2.getSalary());
					int n=ps.executeUpdate();
					if(n>0) {
						System.out.println(n+" record inserted");
						con.close();
						m.method();
					}
					else {
						System.out.println("record not inserted");
						m.method();
					}
				}catch(Exception e)
				{
					System.out.println("Problem connecting to the server");
					m.method();
				}
			} catch (Exception e) {
				System.out.println("Enter proper valid inputs");
				m.method();
			}
	}
}