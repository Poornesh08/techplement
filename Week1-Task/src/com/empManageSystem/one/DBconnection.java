package com.empManageSystem.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	static Connection con;
	public static Connection createDBConnection() {
		
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//get connection
			String url = "jdbc:mysql://localhost:3306/employeeDB?useSSL=false";
			String username="root";
			String password = "pass123";
			con=DriverManager.getConnection(url,username,password);
			
			
		}catch(Exception ex) {
		ex.printStackTrace();
		}
		return con;
	}
	

		
	

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//   public static void main(String[]arg)throws SQLException{
//	   String url = "jdbc:mwsql://localhost/test";
//	   String user ="root";
//	   String sql = "SELECT*FROM sample";
//	   Connection con = DriverManager.getConnection(url,user,pass);
//	   Statement st = con.createStatement();
//	   ResultSet rs = st.executeQuery(sql);
//	   while(rs.next()) {
//		   System.out.printnl(rs.getInt(1)+":"+rs.getString)
//	   }
//   }
//	
	
