package com.tnsif.practice;
import java.sql.*;
import javax.sql.*;
public class f {
	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyd11","root","root");
			
		Statement  st=conn.createStatement();
		String stl="insert into books values(300,'c',44,5)";
		System.out.println(stl);
		
		int count=st.executeUpdate(stl);
		System.out.println(count);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
