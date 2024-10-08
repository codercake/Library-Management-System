# Library Management System

This Java-based project enables users to manage books and members in a library. The system supports adding books, registering members, borrowing and returning books, and viewing the current library inventory. The project is structured into multiple packages (`model`, `service`, and `main`) to maintain a clean, modular design.

## Features

- **Book Management**: Add, view, borrow, and return books.
- **Member Management**: Register new members, view all members, and track borrowed books.
- **Borrow/Return System**: Each member can borrow up to 3 books, and they can return borrowed books.
- **Inventory Management**: View the current library inventory, including all books and their status (available or not).

## Packages and Classes

### 1. **Model Package**
- **`Book`**:
  - Stores information about a book (title, author, bookID).
  - Allows borrowing and returning books by members using `borrowBook()` and `returnBook()` methods.
- **`User`**:
  - Represents a library user with a name and user ID.
- **`Librarian`**:
  - Extends `User` class to represent a librarian.
  - Manages book-related operations.
- **`Member`**:
  - Extends `User` class to represent a library member.
  - Tracks borrowed books and provides methods to borrow and return books.

### 2. **Service Package**
- **`Library`**:
  - Manages a collection of books using `ArrayList`.
  - Provides functionality to add new books (`addBook()`) and view available books (`displayBooks()`).
  - Allows searching for books by ID and removing books.
  
### 3. **Main Package**
- **`Main`**:
  - The main class responsible for running the program.
  - Displays a menu to perform operations such as adding books, registering members, borrowing/returning books, and quitting.

## Key Java Concepts Used

### 1. **`Scanner`**:
   - Used to read user input for various operations like adding books, registering members, borrowing, and returning books. 

### 2. **`ArrayList`**:
   - Used to dynamically store books and members in the `Library` class.

## Running the Project

1. **Clone the Repository**: Clone the repository to your local machine.
2. **Navigate to the Project Directory**: Open your terminal or command prompt and navigate to the project directory.
3. **Compile the Code**: Use your IDE (like Eclipse or IntelliJ IDEA) or command line to compile the code.
4. **Run the Program**: Compile and run the `Main.java` file from the `main` package.



