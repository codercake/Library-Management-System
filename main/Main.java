package main;

import model.Book;
import model.Member;
import model.Librarian;
import service.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        //Create Librarian
        System.out.print("Enter Librarian Name: ");
        String librarianName = scanner.nextLine();
        System.out.print("Enter Librarian ID: ");
        String librarianId = scanner.nextLine();
        Librarian librarian = new Librarian(librarianName, librarianId);
        
        //Create Member
        System.out.print("Enter Member Name: ");
        String memberName = scanner.nextLine();
        System.out.print("Enter Member ID: ");
        String memberId = scanner.nextLine();
        Member member = new Member(memberName, memberId);

        boolean running = true;
        while (running) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to borrow: ");
                    int bookIdToBorrow = scanner.nextInt();
                    Book bookToBorrow = library.findBookById(bookIdToBorrow);
                    if (bookToBorrow != null) {
                        member.borrowBook(bookToBorrow);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int bookIdToReturn = scanner.nextInt();
                    Book bookToReturn = library.findBookById(bookIdToReturn);
                    if (bookToReturn != null) {
                        member.returnBook(bookToReturn);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Book ID to search: ");
                    int bookIdToSearch = scanner.nextInt();
                    Book bookToSearch = library.findBookById(bookIdToSearch);
                    if (bookToSearch != null) {
                        System.out.println("Found Book - " + bookToSearch);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter Book ID to remove: ");
                    int bookIdToRemove = scanner.nextInt();
                    library.removeBook(bookIdToRemove);
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting the library system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}
