package Book;

public class Book {
    String title;
    String author;
    int bookID;
    boolean isBorrowed = false;
    Member.Member borrowedBy = null; //automatic suggestion

    public Book(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    public void borrowBook(Member.Member member) {
        if (!isBorrowed) {
            isBorrowed = true;
            borrowedBy = member;
            System.out.println("Book \"" + title + "\" has been borrowed by " + member.name);
        } else {
            System.out.println("Book \"" + title + "\" is already borrowed by " + borrowedBy.name);
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            System.out.println("Book \"" + title + "\" has been returned by " + borrowedBy.name);
            isBorrowed = false;
            borrowedBy = null;
        } else {
            System.out.println("Book \"" + title + "\" was not borrowed.");
        }
    }
    
    //thread-safe process
    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author +
               (isBorrowed ? " (Borrowed by " + borrowedBy.name + ")" : " (Available)");
    }
}
