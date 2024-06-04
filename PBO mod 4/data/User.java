package data;

import books.Book;
import java.util.ArrayList;
import java.util.List;
import util.iMenu;

public class User {
    protected List<Book> bookList;

    public User() {
        bookList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void displayBook() {
        for (Book book : bookList) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
