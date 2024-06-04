package books;

public class TextBook extends Book {
    private String category = "Textbook";

    public TextBook(String bookId, String title, String author, int stock) {
        super(bookId, title, author, stock);
    }
}
