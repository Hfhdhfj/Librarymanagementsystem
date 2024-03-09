package com.jsp.Lms.model;

import java.util.List;


// class represents a library in the system.
public class Library {

	 public String getLibraryName() {
		return LibraryName;
	}

	public void setLibraryName(String libraryName) {
		LibraryName = libraryName;
	}

	public String getLibraryAddress() {
		return LibraryAddress;
	}

	public void setLibraryAddress(String libraryAddress) {
		LibraryAddress = libraryAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	private String LibraryName;
	 private String LibraryAddress;
	 private int pincode; 
		
	 private List<Book> books;  //Collection of the list of book
		 
	

	 
	 
	 
	
	}



