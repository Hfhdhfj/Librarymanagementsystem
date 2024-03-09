                          Library Management System 

Overview :
The Library Management System (LMS) is a Java-based application designed to manage a library's book collection. The system consists of three main classes: Library, Book, and Controller, along with a user interface class named View. It provides functionalities for adding, removing, updating, and fetching details of books in the library.



Main Features :

Library Setup: During application startup, the librarian enters the library's name, address, and pincode, which are stored for future reference.

Book Management:

Add Book: The librarian can add new books to the library by providing details like book name, author, and price.

Remove Book: The librarian can remove books from the library by entering the book name.

Update Book: The librarian can update existing book information (name, author, or price) by searching for the book and then modifying the desired field.

Get Book: The librarian can search for a book by name and view its details (name, author, price).



Technical Implementation :

The application uses classes to model real-world entities:

Library: Stores information about the library (name, address, pincode) and a collection of books.

Book: Represents a book with attributes like name, author, and price.

A Controller class handles user interactions and delegates tasks to the appropriate model classes (Library and Book).

A View class manages the user interface, taking input from the librarian and displaying messages on the console.

Limitations : 
This is a command-line application, lacking a graphical user interface (GUI).
It doesn't handle user authentication or authorization.
Error handling could be improved to provide more informative messages in case of invalid inputs or unexpected situations.

System Requirements :
Java Runtime Environment (JRE) installed on your computer.

                                                                        Get Started
User Interaction :
The application will greet you with a welcome message and prompt you to enter the library's details during the first run:

![image](https://github.com/Hfhdhfj/Librarymanagementsystem/assets/109065238/e4faecf5-cb75-454b-a00a-941278b2b625)

Once the library details are set, the main menu appears:

![image](https://github.com/Hfhdhfj/Librarymanagementsystem/assets/109065238/8dc8d292-d1df-435b-8a67-a220b4c925a9)


The application will prompt you to enter details for the new book :

![image](https://github.com/Hfhdhfj/Librarymanagementsystem/assets/109065238/6381b48f-977b-40ce-900b-98224954d25a)

Choose option 2: "Remove book"

![image](https://github.com/Hfhdhfj/Librarymanagementsystem/assets/109065238/9e246f91-59f7-4866-876e-ee05b6c90cdc)


Choose option 3: "Update book"


![image](https://github.com/Hfhdhfj/Librarymanagementsystem/assets/109065238/1c537ac9-2ff9-4855-aacb-0af2ff11cc99)


Choose option 4: "Get book" :


![image](https://github.com/Hfhdhfj/Librarymanagementsystem/assets/109065238/46932006-1416-4a16-a9ae-dd16103a19ae)



