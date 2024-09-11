package Book;

import java.util.ArrayList;

public class BookLibrary {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookById(int bookID) {
        for (Book book : books) {
            if (book.bookID == bookID) {
                return book;
            }
        }
        return null;
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
