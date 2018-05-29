package atm_demo;

import java.sql.DriverManager;

import java.sql.*;

public class Connection_ {
	Main_Demo obj = new Main_Demo();
	Connection con1=null;
	public Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
		}
		catch(Exception e) {
			System.out.println("Cannot load driver");
			obj.main();
		}
		return con1;
	}

}
