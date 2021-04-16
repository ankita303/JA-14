package com.java.jdbc.bookoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class BookDAO {
	
	public int addBook(BookBean bookBean) throws ClassNotFoundException,InterruptedException
	
	{
		int i=0;
		System.out.println("Oracle db sample");
		Connection conn =null;
		String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userName = "mycapgdb"; 
		String password = "mycapgdb";	 
		try {
			
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url,userName,password);
		
			String query="insert into book values(?,?,?,?)";
			PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(query);
			pstmt.setInt(1, bookBean.getBookId());
			pstmt.setString(2, bookBean.getTitle());
			pstmt.setDouble(3, bookBean.getPrice());
			pstmt.setString(4, bookBean.getGrade());
			
			i= pstmt.executeUpdate();
			
			System.out.println("Dao layer output i"+i);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception handled "+e);
		}
		
		
		return i;
		
	}

}
