package model;

public class Member extends User {
    public Member(String name, String userId) {
        super(name, userId);
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Borrowed: " + book.getTitle());
        } else {
            System.out.println("Book is currently not available.");
        }
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("Returned: " + book.getTitle());
    }
}
