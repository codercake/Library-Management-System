package Library;

import Book.Book;
import Book.BookLibrary;
import Member.Member;
import Member.MemberLibrary;

import java.util.Scanner;

public class LibMgtSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookLibrary bookLibrary = new BookLibrary();
        MemberLibrary memberLibrary = new MemberLibrary();

        System.out.println("\t\t\t==========================");
        System.out.println("\t\t\tLIBRARY MANAGEMENT SYSTEM");
        System.out.println("\t\t\t==========================");

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Register Member");
            System.out.println("4. View Members");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Quit");
            System.out.print("Enter your choice (1-7): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); 
                    bookLibrary.addBook(new Book(title, author, bookID));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.println("\nBooks in the library:");
                    bookLibrary.showBooks();
                    break;

                case 3:
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    int memberID = scanner.nextInt();
                    scanner.nextLine(); 
                    memberLibrary.addMember(new Member(memberName, memberID));
                    System.out.println("Member registered successfully.");
                    break;

                case 4:
                    System.out.println("\Members in the library:");
                    memberLibrary.showMembers();
                    break;

                case 5:
                    System.out.print("Enter member ID: ");
                    int borrowerID = scanner.nextInt();
                    scanner.nextLine();
                    Member borrower = memberLibrary.getMemberById(borrowerID);
                    if (borrower != null) {
                        System.out.print("Enter book ID to borrow: ");
                        int borrowBookID = scanner.nextInt();
                        scanner.nextLine();
                        Book bookToBorrow = bookLibrary.getBookById(borrowBookID);
                        if (bookToBorrow != null) {
                            borrower.borrowBook(bookToBorrow);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter member ID: ");
                    int returnerID = scanner.nextInt();
                    scanner.nextLine(); 
                    Member returner = memberLibrary.getMemberById(returnerID);
                    if (returner != null) {
                        System.out.print("Enter book ID to return: ");
                        int returnBookID = scanner.nextInt();
                        scanner.nextLine(); 
                        Book bookToReturn = bookLibrary.getBookById(returnBookID);
                        if (bookToReturn != null) {
                            returner.returnBook(bookToReturn);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    break;
            }
        }
    }
}
