package com.tnsif.jdbcprogram;
//DML
import java.sql.*;
import javax.sql.*;   // step 1
public class Preparedstamentdemo {
	public static void main(String[] args) {
		//step2  load and register driver
		// step 3 establish the connection
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tkr","root","root");
			// create statement
			
			Statement st=conn.createStatement();
			
			// execute sql insert statement
			
//			String sqlinsert="insert into book values(4,'javascript',500,4)";
//			
//			System.out.println("the sql statement is "+sqlinsert);
//			
//			int countinserted=st.executeUpdate(sqlinsert);
			
		// Delete the record
			
			String sqldelete="delete from book where bookid=1";
			
			System.out.println("the sql statement"+sqldelete);
			
			int countdeleted=st.executeUpdate(sqldelete);
			System.out.println(countdeleted+" record deleted");
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
