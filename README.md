Daigram represenatation


Start
-> User interacts with View (text-based menu)
+-> Choose option:
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
