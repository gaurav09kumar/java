package atm_demo;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class New_Customer {
	Admin_ obj=new Admin_();
	Scanner sc=new Scanner(System.in);
	Connection_ obj1=new Connection_();
	Connection con=null;
	PreparedStatement ps=null;
	int l=0;
	String p="";
	public void new_()
	{
		try {
			con=obj1.connect();
			ps=con.prepareStatement("insert into main VALUES(?,?,?,?,?,?)");
			while(true) {
				if(con!=null) {
					System.out.println("Conn estab");
					System.out.println("Enter the details of new Customer");
					System.out.println("Enter Customer Name");
					String s=sc.next();
					do {
						System.out.println("Enter Phone number");
						long phone1=sc.nextLong();
						if(phone1>9999999999l) {
							System.out.println("Enter valid phone number");
							l=l+1;
						}
						else
						{
							p=p+phone1;
							l=0;
						}
					}while(l!=0);
					System.out.println("Eneter an absolute amount");
					int amount=sc.nextInt();
					System.out.println("Enter the address of the user");
					String address=sc.next();
					Random r = new Random();
					int random = r.nextInt(1000000000-100000000) + 100000000;
					int random1 = r.nextInt(9999-1000) + 1000 ;
					ps.setInt(1,random);
					ps.setInt(2, random1);
					ps.setString(3, s);
					ps.setString(4,p);
					ps.setString(5,address);
					ps.setInt(6, amount);
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
				System.out.println("Do you want to add another user\npress 'yes' or 'no'");
				String rep=sc.next();
				if(rep.equals("yes")) {
					continue;
				}
				else {
					break;
				}
			}
			obj.method();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Enter valid inputs");
			obj.method();
		}finally {
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
