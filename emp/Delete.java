package employee;
import java.sql.*;
import java.util.*;
public class Delete {
	public void d(){
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name you \n whose record you want to delete");
		String s=sc.nextLine();
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
		PreparedStatement ps=con.prepareStatement("delete from employee where name=?");
		ps.setString(1, s);
		int n=ps.executeUpdate();
		if(n>0) {
			System.out.println(n+" record deleted");
			con.close();
		}
		else {
			System.out.println("record not deleted");
		}
		Main_ m=new Main_();
		m.method();
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}