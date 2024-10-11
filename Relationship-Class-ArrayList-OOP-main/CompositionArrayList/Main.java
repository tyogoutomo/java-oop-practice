package CompositionArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating objects of Book class inside main()
        // method Custom inputs
        Book b1
            = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2
            = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference",
                           "Herbert Schildt");
 
        // Creating the list which contains number of books
        ArrayList<Book> books = new ArrayList <Book>();
 
        // Adding books
        // using add() method
        books.add(b1);
        books.add(b2);
        books.add(b3);
 
        Library library = new Library(books);
 
        // Calling method to get total books in library
        // and storing it in list of user0defined type -
        // Books
        ArrayList<Book> bks = library.getTotalBooksInLibrary();
 
        // Iterating over books using for each loop
        for (Book bk : bks) {
 
            // Printing the title and author name of book on
            // console
            System.out.println("Title : " + bk.title
                               + " and "
                               + " Author : " + bk.author);
        }
	}

}
/*
 * Penjelasan :
 * Dalam contoh di atas, perpustakaan tidak boleh memiliki buku dengan topik yang sama atau berbeda . 
 * Jadi, Jika Perpustakaan dimusnahkan maka Semua buku di perpustakaan tersebut akan dimusnahkan. 
 * yaitu buku tidak akan ada tanpa perpustakaan. Itu sebabnya ini adalah komposisi. 
 * Buku adalah Bagian dari Perpustakaan.
 * 
 * 
*/
