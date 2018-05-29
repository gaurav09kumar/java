package employee;
import java.sql.*;
public class View {
	public void v() {
		try {
			System.out.println();
			System.out.println("FETCHING DATA...");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
			PreparedStatement ps=con.prepareStatement("select * from employee");
			ResultSet result=ps.executeQuery();
			System.out.format("%20s%20s%20s%20s%20s", "Employee Name", "Employee Id", "Department", "Annual Income",
					"Final salary");
			System.out.println();
			while(result.next()) {
				System.out.format("%20s",result.getString(1));
				System.out.format("%20s",result.getInt(2));
				System.out.format("%20s",result.getString(3));
				System.out.format("%20s",result.getDouble(4));
				System.out.format("%20s",result.getDouble(5));
				System.out.println();
			}
			System.out.println("DATA FETCHED..!!");
			Main_ m2=new Main_();
			m2.method();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
