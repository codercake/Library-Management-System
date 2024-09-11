# Library Management System

This Java-based Project enables users to manage books and members in a library. The system supports adding books, registering members, borrowing and returning books, and viewing the current library inventory. The project is structured into multiple packages (`Book`, `Member`, and `LibMgtSys`) to maintain a clean, modular design.

## Features

- **Book Management**: Add, view, borrow, and return books.
- **Member Management**: Register new members, view all members, and track borrowed books.
- **Borrow/Return System**: Each member can borrow up to 3 books, and they can return borrowed books.
- **Inventory Management**: View the current library inventory, including all books and their status (available or not)

## Packages and Classes

### 1. **Book Package**
- **`Book`**:
  - Stores information about a book (title, author, bookID).
  - Allows borrowing and returning books by members using `borrowBook()` and `returnBook()` methods.
- **`BookLibrary`**:
  - Manages a collection of books using `ArrayList`.
  - Provides functionality to add new books (`addBook()`) and view available books (`showBooks()`).

### 2. **Member Package**
- **`Member`**:
  - Represents a library member with a name and member ID.
  - Tracks borrowed books using `ArrayList`.
  - Methods to borrow (`borrowBook()`) and return books (`returnBook()`).
- **`MemberLibrary`**:
  - Manages a list of registered members using `ArrayList`.
  - Allows registering new members (`addMember()`) and viewing all members (`showMembers()`).

### 3. **LibMgtSys Package**
- **`LibraryManagementSystem`**:
  - The main class responsible for running the program.
  - Displays a menu to perform operations such as adding books, registering members, borrowing/returning books, and quitting.

## Key Java Concepts Used

### 1. **`Scanner`**:
   - Used to read user input for various operations like adding books, registering members, borrowing, and returning books. 

### 2. **`StringBuilder` and `StringBuffer`**:
   - Used to build dynamic strings when displaying book and member details efficiently.
   - `StringBuilder` is used when string modifications are needed without thread-safety concerns.

### 3. **`ArrayList`**:
   - Used to dynamically store books and members in both the `BookLibrary` and `MemberLibrary` classes.


## Running the Project

Compile and run the `LibraryManagementSystem.java` file from the `LibMgtSys` package.

