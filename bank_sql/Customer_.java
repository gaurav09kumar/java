package atm_demo;
import java.sql.*;
import java.util.*;
public class Customer_ {
	Connection con=null;
	ResultSet results=null;
	Main_Demo obj=new Main_Demo();
	public void method_() {
		Scanner sc=new Scanner(System.in);
		try {
			Connection_ obj1=new Connection_();
			con=obj1.connect();
			if(con!=null) {
				System.out.println("Connection successuful");
				System.out.println("Enter the ACOUNT NUMBER");
				int f=sc.nextInt();
				PreparedStatement ps=con.prepareStatement("select pin from main where acc_number=?"); 
				ps.setInt(1,f);
				results=ps.executeQuery();
				while(results.next()) {
				System.out.println("account found");
				int key=results.getInt(1);
				System.out.println("Enter the pass key");
				int k=sc.nextInt();
				if(key==k) {
					System.out.println("Login Successful");
					Customer_List l=new Customer_List();
					con.close();
					l.list(f,key);
				}
				else {
					System.out.println("login not successfull");
					con.close();
					method_();
				}
				
			}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
			obj.main();
		}
		finally {
			try {
				con.close();
				sc.close();
				results.close();
			}
			catch(SQLException e) {
				obj.main();
			}
		}

	}
}

