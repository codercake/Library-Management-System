package service;

import model.Book;

public interface LibraryOperations {
    void borrowBook(Book book);
    void returnBook(Book book);
}
