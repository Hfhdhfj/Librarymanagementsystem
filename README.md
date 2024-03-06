Document for Console-Based Library Management System:


1. Introduction :

This document describes a console-based library management system (LMS) written in Java. 
The system allows users to add, remove, update, and search for books within a library.

2. System Requirements:

Java Runtime Environment (JRE) 11 or later
Scanner class for user input

3. System Design:

The system is divided into three main components:

Model: Contains classes representing real-world entities like Library and Book. These classes define the attributes and behaviors of the entities.
Controller: Handles user interaction and performs operations on the model. It calls methods on the model classes to add, remove, update, and search for books.
View: Responsible for displaying information to the user and getting user input. It utilizes the Scanner class to interact with the user.
4. Functionalities:

Add Book: Allows users to add a new book to the library by specifying its name, author, and price.
Remove Book: Users can remove a book from the library by providing its name.
Update Book: Users can update the details of an existing book by specifying its name and the attribute they want to change (e.g., name, author, price).
Search Book: Users can search for a book by its name and view its details if available.

5. User Interface (UI):

The system utilizes a text-based interface where users interact with the system through menus and prompts.
The main menu displays options for adding, removing, updating, searching for books, and exiting the system.
Sub-menus appear for specific functionalities like updating a book, where users can choose which attribute to modify.
Prompts guide users for providing input, such as book name, author, and price.

6. Implementation Details:

The Library class holds information about the library, including its name, address, and pincode. It also maintains a list of Book objects representing the books stored in the library.
The Book class stores details about a book, including its name, author, and price.
The Controller class handles user interactions. It reads user input from the View and performs the corresponding operations on the Library object.
The View class displays menus, prompts, and book information to the user. It also reads user input using the Scanner class.

7. Testing:

The system was tested with various test cases to ensure it functions as expected for different scenarios:
Adding new books with valid and invalid data.
Removing existing and non-existent books.
Updating various book attributes.
Searching for books with different names.

8. Deployment

To run the system, users need to have Java installed and set up the environment variables. 
They can then compile the source code using a Java compiler and run the generated executable file.

9. Conclusion

This document provides an overview of a basic console-based library management system in Java. 
The system demonstrates essential functionalities for managing library books and user interactions.

10. Appendix

Source code: The complete source code for the system can be found in the following files:

Library.java
Book.java
Controller.java
View.java

Sample input/output: A sample interaction with the system showcasing adding, searching, and updating functionalities can be included.
This document serves as a starting point for understanding the system's design, functionalities, and implementation details.
It can be further expanded to include additional features and functionalities based on specific requirements.



Daigram representation: 


Start
-> User interacts with View (text-based menu)
-> Choose option:
  |-> Add Book
  |   -> Enter book details (name, author, price)
  |   -> Controller adds book to Library
  |-> Remove Book
  |   -> Enter book name
  |   -> Controller removes book from Library (if found)
  |-> Update Book
  |   -> Enter book name to update
  |   -> Find book (Controller)
  |     -> If found:
  |       -> Choose update option (name, author, price)
  |       -> Update book details (Controller)
  |     -> Else: Book not found
  |-> Get Book
  |   -> Enter book name
  |   -> Controller searches for book in Library
  |     -> If found: Display book details
  |     -> Else: Book not found
  +-> Exit program
End
