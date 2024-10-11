package CompositionArrayList;

import java.util.ArrayList;

public class Library {
	// Reference to refer to list of books
    private final ArrayList<Book> books;
 
    // Library class contains list of books
    Library(ArrayList<Book> books)
    {
 
        // Referring to same book as
        // this keyword refers to same instance itself
        this.books = books;
    }
 
    // Method
    // To get total number of books in library
    public ArrayList<Book> getTotalBooksInLibrary()
    {
 
        return books;
    }
}
