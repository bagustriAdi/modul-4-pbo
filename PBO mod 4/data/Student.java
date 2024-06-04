package data;

import books.Book;
import java.util.ArrayList;
import java.util.List;
import util.iMenu;

public class Student extends User implements iMenu {
    private String name;
    private String faculty;
    private String nim;
    private String programStudi;
    private List<Book> borrowedBooks;

    public Student() {
        borrowedBooks = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Faculty: " + faculty);
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + programStudi);
    }

    public void menu() {
        System.out.println("Student Menu:");
        System.out.println("1. Display Info");
        System.out.println("2. Choice Book");
        System.out.println("3. Show Borrowed Books");
        System.out.println("4. Logout");
        // Add additional menu options and functionality
    }

    public void choiceBook() {
        System.out.println("Choosing a Book:");
        displayBook(); // Display all books available in the library
        // Add logic for choosing and borrowing books
    }

    public void showBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle());
        }
    }

    public void returnBooks() {
        // Logic to return borrowed books
    }
}
