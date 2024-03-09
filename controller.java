package com.jsp.Lms_controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.Lms.model.Book;
import com.jsp.Lms.model.Library;
import com.jsp.Lms_view.View;

public class controller {

	private Library library = View.getLibrary();// we get the library of lit which store in object of
												// view class so from we use view.getlibrary to get the list of library

	public void addBook(Book book) {
		List<Book> books = library.getBooks();// from the object of library of controller we get the list of book
												// present in library
		if (books == null) // now we have to check whether the library is empty or not we use dms
		{
			books = new ArrayList<>();// if book is null then we have to create a arraylist of book
		}
		books.add(book);
		library.setBooks(books);// then set the books in books object
	}
	
	
	
	

	public Book getBook(String name)
	{
		List<Book> books = library.getBooks(); // again by using the object of controller we use
												// library of list which was there in object of view class.
		if (books != null)// List of books exist
		{
			for (Book book : books) // then we check line by line where is the book so we use enhance for loop
			{
				if (book.getBookname().equalsIgnoreCase(name))
				 {
					return book;
							// If book is present it will return book
				}
			}
		}
		return null; // Otherwise null

	}
	
	
	
	
	
	public boolean removebook(String name)//Remove method have boolean.
	{
		Book book = getBook(name);// use the getBook() which is checking the existing
									// book then it will return the books object
		if (book != null) // Now we check the that book is null or not by dms
		{
			List<Book> books = library.getBooks(); // From the existing library we get
													// the books and it will return the list of book object
			books.remove(book); //
			library.setBooks(books); // again we have to set the previous library with the updated list
			return true; // book is removed it will give true
		}
		return false;
	}



	// bookExist: A Book object representing the book to be updated.
	// booktoupdate: A Book object containing the updated information (new author,
	// price, etc.

	public boolean updatebook(Book bookExist, Book booktoupdate) {
		List<Book> books = library.getBooks(); // Fetches the current list of books from the library using
												// library.getBooks().
		for (Book book : books) {
			if (book.getBookauthor().equalsIgnoreCase(bookExist.getBookname())) { // Compares the author of each book
																					// (using book.getBookauthor())
				// with the name of bookExist (using equalsIgnoreCase for case-insensitive
				// comparison).{
				books.remove(bookExist);// Removes the existing book from the list using books.remove(bookExist)
				books.add(booktoupdate);// Adds the booktoupdate object (containing the updated information)
										// to the list using books.add(booktoupdate).
				library.setBooks(books);
				// ets the library's book list to the list using library.setBooks(books).
				return true; // if the update was successful (
			}
		}
		return false;// if the update failed

	}	
	
	
	

}
	

