package com.tnsif.jdbcprogram;
// jdbc program
//DDL
import java.sql.*;
import javax.sql.*;    // step 1 import packages

public class Jdbcselect {
	 public static void main(String[] args) {
		// step 2 load and register driver
		 // step 3 establish connection
		 
 try {
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tkr","root","root");
	// step 4  create statement
	
	Statement st=conn.createStatement();
	
	//step 5: execute query
	
	String strselect="select booktitle,price,qty from book";
	
	System.out.println("the sql statement is"+strselect);
	
	//process the result to display
	
	ResultSet rst=st.executeQuery(strselect);
	
	System.out.println("the records are");
	
	int rowcount=0;
	while(rst.next()) {
		String booktitle=rst.getString("booktitle");
		int price =rst.getInt("price");
		int qty=rst.getInt("qty");
		
		System.out.println(booktitle +" "+price+" "+qty);
		
		++rowcount;
	}
	
	
	
	
	
	
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
