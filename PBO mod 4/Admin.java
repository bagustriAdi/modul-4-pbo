package data;

import books.Book;

public class Admin {
    // Overloading addBook method
    public void addBook(Book book) {
        // Add book to the list
    }

    public void addBook(String bookId, String title, String author, int stock) {
        Book book = new Book(bookId, title, author, stock);
        addBook(book); // Call the other addBook method
    }
}
