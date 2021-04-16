package com.java.jdbc.bookoracle;
import java.sql.SQLException;
import java.util.Scanner;
public class BookMainController {
		public static void main(String[] args) throws ClassNotFoundException,SQLException {
		int bookId=0;
		String title=null;
		double price;
		 try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book ID :");
		bookId=sc.nextInt();
		System.out.println("Enter Book Title :");
		title=sc.next();
		System.out.println("Enter Book Price :");
		price=sc.nextDouble();
		
		BookService  bookService=new BookService();
	int t=	bookService.addBookService(bookId, title, price);
		
	System.out.println("Main controller Return value is : "+t);
		
		
		

	}
		 
		 catch(Exception e)
		 {
			 System.out.println("Exception handled "+e);
			 
			 }
		 }

}
