package Member;

public class Member {
    private int id;
    private String name;
    private int borrowedCount;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedCount = 0;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    public void incrementBorrowedCount() {
        this.borrowedCount++;
    }

    public void decrementBorrowedCount() {
        this.borrowedCount--;
    }
}
