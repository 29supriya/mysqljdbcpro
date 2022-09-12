package com.idiot.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MySqlJDBC {
public static void main(String[] args) {
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql:/// sql_workbench","root","root");
		Statement st = con.createStatement();
		
		String query = "select * from students";
				
	
				ResultSet rs = st.executeQuery(query);
				
				while(rs.next()) {
					System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3)+"," +rs.getString(4)+","+rs.getString(5)+","+rs.getString(6));
        }
				con.close();
	}catch(SQLException e) {
		System.out.println("Error");
	}catch(Exception e) {
		e.printStackTrace();
	}
}	
}
				
				
				
		
				
	
	


