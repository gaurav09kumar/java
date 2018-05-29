package jdbc__;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PreparedStatementDemo {
	public static void main(String [] args) {
		String choice="";
		Connection con=null;
		PreparedStatement preparedStatement=null;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
			preparedStatement=con.prepareStatement("insert into employee values(?,?,?)");
			while(true) {
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter name");
				String s=sc.next();
				System.out.println("enter salary");
				Double d=sc.nextDouble();
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, s);
				preparedStatement.setDouble(3, d);
				int n=preparedStatement.executeUpdate();
				if(n>0) {
					System.out.println(n+" record inserted");
				}
				else {
					System.out.println("record not inserted");
				}
				System.out.println();
				System.out.println("if you want to enter one more record \n press y for yes and n for no..!");
				choice=sc.next();
				if(choice.equals("y"))
				{
					continue;
				}
				else
				{
					break;
				}
				
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter valid inputs");
		}
		catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				preparedStatement.close();
				con.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		sc.close();
}
}
