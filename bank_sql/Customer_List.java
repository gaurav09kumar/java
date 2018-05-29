package atm_demo;
import java.util.*;
import java.sql.*;

public class Customer_List {
	public void list(int i,int j) {
		Connection con1=null;
		ResultSet res=null;
		ResultSet res1=null;
		ResultSet res2=null;
		ResultSet res3=null;

		int r=0;;
		Scanner s = new Scanner(System.in);
		int balance = 0, withdraw, deposit;
		int b=i;
		System.out.println(b);

		while(true) {
			try {
				System.out.println("Welcome Customer");
				System.out.println();
				System.out.println("Choose 1 for Withdraw");
				System.out.println("Choose 2 for Deposit");
				System.out.println("Choose 3 for Check Balance");
				System.out.println("Choose 4 for view Profile");
				System.out.println("Choose 5 to change pincode");
				System.out.println("Choose 6 for EXIT");
				System.out.print("Choose the operation you want to perform:");
				int n=s.nextInt();
				switch(n) {
				case 1:
					Connection_ obj1=new Connection_();
					con1=obj1.connect();
					if(con1!=null) {
						System.out.println("Connection successuful");
						PreparedStatement ps1=con1.prepareStatement("select balance from main where acc_number="+b);
						res=ps1.executeQuery();
						if(res.next()) {
							balance=res.getInt(1);
							System.out.println("Current balance "+balance);
							if(balance>0) {
								System.out.println("Enter the amount you want to withdraw");
								withdraw = s.nextInt();
								if(balance >= withdraw  && withdraw<=20000)
								{
									balance = balance - withdraw;
									PreparedStatement ps3=con1.prepareStatement("UPDATE main SET balance=? where acc_number="+b);
									ps3.setInt(1,balance);
									r=ps3.executeUpdate();
									if(r>0) {
										System.out.println("new Balance "+balance);
										con1.close();
										res.close();
										continue;
									}
								}
								else
								{
									System.out.println("Insufficient Balance or invalid amount(amount<20000)");
									continue;
								}
							}
							else
							{
								System.out.println("Insufficient balance");
							}
						}
					}
					else {
						System.out.println("Cannot connect to server");
					}
					break;
				case 2:
					Connection_ obj2=new Connection_();
					con1=obj2.connect();
					if(con1!=null) {
						System.out.println("Connection successuful");
						PreparedStatement ps5=con1.prepareStatement("select balance from main where acc_number="+b);
						res1=ps5.executeQuery();
						if(res1.next()) {
							balance=res1.getInt(1);
							System.out.println("Current balance "+balance);
							System.out.println("Enter the amount you want to deposit");
							deposit = s.nextInt();
							if(deposit<=99999999) {
								balance = balance+deposit;
								PreparedStatement ps4=con1.prepareStatement("UPDATE main SET balance=? where acc_number="+b);
								ps4.setInt(1,balance);
								r=ps4.executeUpdate();
								if(r>0) {
									System.out.println("new Balance "+balance);
									con1.close();
									res1.close();
									continue;
								}
							}
							else {
								System.out.println("Enter a lesser amount");
								con1.close();
								continue;
							}
						}
					}
					else {
						System.out.println("Cannot connect to server");
					}
					break;
				case 3:
					Connection_ obj3=new Connection_();
					con1=obj3.connect();
					if(con1!=null) {
						System.out.println("Connection successuful");
						PreparedStatement ps5=con1.prepareStatement("select balance from main where acc_number="+b);
						res2=ps5.executeQuery();
						if(res2.next()) {
							balance=res2.getInt(1);
							System.out.println("Current balance "+balance);
							System.out.println();
							con1.close();
							res2.close();
							continue;
						}
					}else {
						System.out.println("Cannot connect to server");
						continue;
					}
				case 4:
					Connection_ obj4=new Connection_();
					con1=obj4.connect();
					if(con1!=null) {
						System.out.println("Connection successuful");
						PreparedStatement ps8=con1.prepareStatement("select * from main where acc_number="+b);
						System.out.println("FETCHING DATA...");
						res3=ps8.executeQuery();
						System.out.format("%20s%20s%20s%20s%20s%20s", "Account Number", "Pin", "Name", "Phone","Address","balance");
						System.out.println();
						while(res3.next()) {
							System.out.format("%20s",res3.getInt(1));
							System.out.format("%20s",res3.getInt(2));
							System.out.format("%20s",res3.getString(3));
							System.out.format("%20s",res3.getString(4));
							System.out.format("%20s",res3.getString(5));
							System.out.format("%20s",res3.getInt(6));
							System.out.println();
							System.out.println();
							System.out.println("DATA FETCHED..!!");
						}
						continue;
					}
					else {
						System.out.println("cannot connect");
					}
				case 5:
					Connection_ obj5=new Connection_();
					con1=obj5.connect();
					if(con1!=null) {
						System.out.println("Connection successuful");
						System.out.println("Enter the previous pin");
						int a=s.nextInt();
						int z=j;
						if(a==z) {
							System.out.println("Enter the new pin");
							int u=s.nextInt();
							if(u>999 && u<=9999) {
								PreparedStatement ps4=con1.prepareStatement("UPDATE main SET pin=? where acc_number="+b);
								ps4.setInt(1,u);
								int m=ps4.executeUpdate();
								if(m>0) {
									s.close();
									System.out.println("Password Successfully changed");
									Customer_ object__=new Customer_();
									object__.method_();
									ps4.close();
								}else {
									System.out.println("Cannot connect");
								}
							}
						}
						else {
							System.out.println("incorrect pin");
							continue;
						}
					}
					else {
						System.out.println("Cannot connect");
						continue;
					}
				case 6:
					Main_Demo mem=new Main_Demo();
					mem.main();
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Enter valid inputs");
			} catch (SQLException e) {
				System.out.println("Problem connecting to server");
			}
		}
	}
}
