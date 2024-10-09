package service;

import model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books;
    private Scanner scanner;

    public Library() {
        this.books = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addBook() {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book added: " + title);
    }

    public void displayBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null; //Book not found
    }

    public void removeBook(int bookId) {
        Book bookToRemove = findBookById(bookId);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book with ID " + bookId + " has been removed.");
        } else {
            System.out.println("Book with ID " + bookId + " not found.");
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public Scanner getScanner() {
        return scanner;
    }
}
