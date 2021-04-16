package com.java.jdbc.bookoracle;
public class BookService {
	                               //100       corejava    250
	public int  addBookService(int bookId,String title,double price) throws ClassNotFoundException, InterruptedException
	{  
		String grade="";
		if(price<=300)
		{
			grade="C";
		}
		else if(price<=600)
		{
			grade="B";
		}
		else
		{
			grade="A";
		}		
		BookBean bookBean=new BookBean();
		bookBean.setBookId(bookId);
		bookBean.setTitle(title);
		bookBean.setPrice(price);
		bookBean.setGrade(grade);
		
		BookDAO bookdao=new  BookDAO();
	int k=	bookdao.addBook(bookBean);

		return k;
	
	}

}
