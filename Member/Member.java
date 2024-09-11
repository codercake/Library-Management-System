package Member;

import Book.Book;
import java.util.ArrayList;

public class Member {
    public String name;
    int memberID;
    ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Member(String name, int memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 3) {  //limit of 3 books per member
            borrowedBooks.add(book);
            book.borrowBook(this);
        } else {
            System.out.println(name + " has already borrowed 3 books. Return one to borrow more.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
        } else {
            System.out.println(name + " has not borrowed this book.");
        }
    }

    public String toString() {
        return "Member ID: " + memberID + ", Name: " + name + ", Borrowed Books: " + borrowedBooks.size();
    }
}
