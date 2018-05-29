package atm_demo;
import java.util.*;
import java.sql.*;
public class View_One {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet result=null;
	Admin_ obj=new Admin_();
	public void one() {
		Scanner sc=new Scanner(System.in);
		try {
		Connection_ obj1=new Connection_();
		con=obj1.connect();
		while(true) {
			if(con!=null) {
				System.out.println("Connection successuful");
				System.out.println("Enter Account number");
				int  d=sc.nextInt();
				ps=con.prepareStatement("select * from main where acc_number=?");
				ps.setInt(1,d);
				System.out.println("FETCHING DATA...");
				result=ps.executeQuery();
				System.out.format("%20s%20s%20s%20s%20s%20s", "Account Number", "Pin", "Name", "Phone","Address","balance");
				System.out.println();
				while(result.next()) {
					System.out.format("%20s",result.getInt(1));
					System.out.format("%20s",result.getInt(2));
					System.out.format("%20s",result.getString(3));
					System.out.format("%20s",result.getString(4));
					System.out.format("%20s",result.getString(5));
					System.out.format("%20s",result.getInt(6));
					System.out.println();
					System.out.println();
					System.out.println("DATA FETCHED..!!");
				}
				System.out.println("Do you want to view another user\npress 'yes' or 'no'");
				String rep=sc.next();
				if(rep.equals("yes")) {
					continue;
				}
				else {
					obj.method();
				}
				}
			}
		}catch(Exception e) {
			System.out.println("Error");
			obj.method();
		}
		finally {
			try {
				ps.close();
				con.close();
				sc.close();
				obj.method();
			}
			catch(SQLException e) {
				e.printStackTrace();
				obj.method();
			}
		}
		
	}
}
