package Library;

import Book.Book;
import Book.BookLibrary;
import Member.Member;
import Member.MemberLibrary;

import java.util.Scanner;

public class LibMgtSys {
    static BookLibrary bookLibrary = new BookLibrary();
    static MemberLibrary memberLibrary = new MemberLibrary();
    static Scanner scanner = new Scanner(System.in);

    public void displayDetails() {
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Register Member");
            System.out.println("4. View Members");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Quit");
            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: addBook(); break;
                case 2: viewBooks(); break;
                case 3: registerMember(); break;
                case 4: viewMembers(); break;
                case 5: borrowBook(); break;
                case 6: returnBook(); break;
                case 7: System.out.println("Quitting the program."); return;
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addBook() {
        System.out.print("Enter book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        bookLibrary.addBook(new Book(id, title, author));
        System.out.println("Book added successfully.");
    }

    public static void viewBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : bookLibrary.getBooks()) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Borrowed: " + book.isBorrowed());
        }
    }

    public static void registerMember() {
        System.out.print("Enter member ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();

        memberLibrary.addMember(new Member(id, name));
        System.out.println("Member registered successfully.");
    }

    public static void viewMembers() {
        System.out.println("\nRegistered Members:");
        for (Member member : memberLibrary.getMembers()) {
            System.out.println("ID: " + member.getId() + ", Name: " + member.getName() + ", Books Borrowed This Week: " + member.getBorrowedCount());
        }
    }

    public static void borrowBook() {
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();
        System.out.print("Enter book ID to borrow: ");
        int bookId = scanner.nextInt();

        Member member = memberLibrary.findMemberById(memberId);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        Book book = bookLibrary.findBookById(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isBorrowed()) {
            System.out.println("Book is already borrowed.");
            return;
        }

        if (member.getBorrowedCount() >= 5) {
            System.out.println("Cannot borrow more than 5 books per week.");
            return;
        }

        book.setBorrowed(true);
        member.incrementBorrowedCount();
        System.out.println("Book borrowed successfully.");
    }

    public static void returnBook() {
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();
        System.out.print("Enter book ID to return: ");
        int bookId = scanner.nextInt();

        Member member = memberLibrary.findMemberById(memberId);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        Book book = bookLibrary.findBookById(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isBorrowed()) {
            System.out.println("Book was not borrowed.");
            return;
        }

        book.setBorrowed(false);
        member.decrementBorrowedCount();
        System.out.println("Book returned successfully.");
    }

    public static void main(String[] args) {
        System.out.println("\t\tLibrary Management System Menu:");
        LibMgtSys lms = new LibMgtSys();
        lms.displayDetails();
    }
}
