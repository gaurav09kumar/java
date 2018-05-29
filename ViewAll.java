package atm_demo;
import java.sql.*;
public class ViewAll {
	Connection con=null;
	PreparedStatement ps=null;
	public void viewall() {
		Connection_ c=new Connection_();
		try {
			con=c.connect();
			ps=con.prepareStatement("select * from main");
			if(con!=null) {
			System.out.println("Conn estab");
			System.out.println();
			System.out.println("FETCHING DATA...");
			ResultSet result=ps.executeQuery();
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
			}
			System.out.println("DATA FETCHED..!!");
			Admin_ obj=new Admin_();
			obj.method();
			}
			else {
				System.out.println("Could not connect");
			}
		}

		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				con.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}