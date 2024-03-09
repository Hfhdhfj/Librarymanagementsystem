
package com.jsp.Lms_view;

import java.lang.ModuleLayer.Controller;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;

import com.jsp.Lms.model.Book;
import com.jsp.Lms.model.Library;
import com.jsp.Lms_controller.controller;

public class View {
// Startup of the application
	static private Library library = new Library();// single line initializer..... store the info of library.
	static Scanner Myinput = new Scanner(System.in); // so we can used globally inside the class .

	public static Library getLibrary() // creating it get the object of library.
	{
		return library;
	}

	public static void setLibrary(Library library) // Creating it set the object of library.
	{
		View.library = library;
	}

	static controller Controller = new controller();

	static {
		// Multiple line initializer
		System.out.println("===Welcome to Lms ====");
		System.out.print("Enter the name of library :");
		String LibraryName = Myinput.nextLine();
		library.setLibraryName(LibraryName);
		System.out.print("Enter the address :");
		library.setLibraryAddress(Myinput.nextLine());

		while (true)
			try {
				System.out.print("Enter the pin code:");
				library.setPincode(Myinput.nextInt());
				Myinput.nextLine();
				break;

			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid pin code:");
				Myinput.nextLine();
			}
	}

	public static void main(String[] args)

	{
//	   System.out.println("Name=" + library.getLibraryName());
//	   System.out.println("address =" +library.getLibraryAddress());
//	   System.out.println("pincode =" + library.getPincode());

		do {

			System.out.println("Select the option to perform :");
			System.out.println("1.Add book\n2.Remove book \n3.Update book \n4.get book\n0.exit");
			System.out.print("Enter the appropriate desired option:");
			int userchoice = Myinput.nextByte();
			Myinput.nextLine();

			switch (userchoice) {
			case 0:
				Myinput.close();
				System.out.println("-----Existed------");
				System.exit(userchoice);
				break;

		case 1:
			
			Book book = new Book();
		    System.out.print("Enter the name of book :");
			String bookname = Myinput.nextLine();
			book.setBookname(bookname);
		    System.out.print("Enter the author of the book :");
		    book.setBookauthor( Myinput.nextLine());
		    System.out.print("Enter the price :");
		    book.setBookprice(Myinput.nextDouble());
		   
		    Controller.addBook(book); //call the add book() by passing the arguments
		    System.out.println("Book is add .");
		
		    break;
		    
		    
		case 2:
			System.out.print(" Enter the book to remove :");
			String bookname1 = Myinput.nextLine();
//		boolean removebook = Controller.removebook(bookname1);) It will return the boolean values 
		{
			if (Controller.removebook(bookname1))// so we directly assign that condition inside if statement
			{
				System.out.println(" Requested book removed:");
			} else {
				System.out.println("Requested book is not available.");

			}
		}
			break;
		
			
		case 3:
			System.out.println("Enter book to update:");
			Book bookExist = Controller.getBook(Myinput.nextLine());
			//reads the book name entered by the user from the console and passes it as an argument to the getBook method.
			//The getBook method searches for a book in the library that matches the provided name.
			//If a book is found, the getBook method returns a Book object containing the information for that book. 
			//This object is then assigned to the variable bookExist.
			
			
			
			Book booktoupdate = bookExist;//creates a new reference variable named booktoupdate and assigns it the same value as bookExist. This creates a copy of the reference to the Book
			
			if (bookExist != null) { //Book is exist 


				System.out.println("what to change");
				System.out.println("1.Book Name \n2.Author name \n3.Book price");
				Byte UpdateChoice = Myinput.nextByte();
				Myinput.nextLine();
				switch (UpdateChoice) {
				case 1:
					System.out.print("Enter book name to update:");
					String newbookname = Myinput.nextLine();
                    booktoupdate.setBookauthor(newbookname);
					break;

				case 2:
					System.out.print("Enter author name to update :");
					String newbookauthor = Myinput.nextLine();
                    booktoupdate.setBookauthor(newbookauthor);
					break;

				case 3:
					System.out.print("Enter Book price to update :");
				     double newprice = Myinput.nextDouble();
				     Myinput.nextLine();
                     bookExist.setBookprice(newprice);
				
				     break;

				default:
					System.out.println("Invalid output.");
					break;
				}
				    Controller.updatebook(bookExist, booktoupdate);
				    System.out.println("Book is updated:");
                       
			        }

			        break;
		
			
		case 4:

			System.out.print("Fetch the book : ");
			Book Fetchbook = Controller.getBook(Myinput.nextLine()); // Calling the method of getbook it will return the object
																	

		{
			if (Fetchbook != null) // by using the object check the condition whether the book is fetch or not
			{
				System.out.println("Book is availabe :");
				System.out.println("Details :");
				System.out.println(Fetchbook);

			} 
			else 
			{
				System.out.println("Book is not available :");
			}
		}

			break;
			
			
			
			

		default:
		{
			System.out.println("Invalid option ");
			break;
		}		   
		   
		   
		   
		   
			}
			} while(true);
			
		
		
		}
	

}


