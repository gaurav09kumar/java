package jdbc__;
import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from employee");
while(rs.next()) {
	System.out.println(rs.getInt(1)+" "+rs.getString(2));
}
}catch(Exception e){ System.out.println(e);
}  
}  
}  