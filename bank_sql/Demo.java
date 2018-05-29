package atm_demo;
import java.sql.*;
import java.util.*;
public class Demo {
	public static void main(String [] args) {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
			if(con!=null) {
				System.out.println("Conn estab");
				ps=con.prepareStatement("insert into main values(?,?,?,?,?,?,?)");
				System.out.println("Enter the details of new Customer");
				System.out.println("Enter Customer Name");
				String s=sc.next();
				System.out.println("Enter Phone number");
				double phone=sc.nextDouble();
				System.out.println("Amount to create an account");
				double amount=sc.nextDouble();
				Random r = new Random();
				int random = r.nextInt(1000000000-100000000) + 100000000;
				int random1 = r.nextInt(9999-1000) + 1000 ;
				ps.setDouble(1,random);
				ps.setString(2, s);
				ps.setDouble(3, phone);
				ps.setDouble(4, amount);
				ps.setDouble(5,amount);
				ps.setInt(6,0);
				ps.setInt(7, random1);
				int n=ps.executeUpdate();
				if(n>0) {
					System.out.println("Account added");
				}
				else {
					System.out.println("Acccount not added");
				}
			}
			else
			{
				System.out.println("Error");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
