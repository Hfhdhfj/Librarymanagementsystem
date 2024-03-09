package com.jsp.Lms.model;


// This class represents a book in the system.
public class Book {

	 private String bookname;
	 private String bookauthor;
	 private double bookprice;
	 
	 
	    public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public double getBookprice() {
		return bookprice;
	}

	public void setBookprice(double d) {
		this.bookprice = d;
	}

	@Override
	public String toString()
	{
		return  " Book name = " + bookname + ", Book author = " + bookauthor + ", Book price=" + bookprice  ;
	}//to print data rather than address.

	
	 
	
}
