package model;

public class Librarian extends User {
    public Librarian(String name, String userId) {
        super(name, userId);
    }

    public void manageBooks() {
        System.out.println("Managing books...");
    }
}
