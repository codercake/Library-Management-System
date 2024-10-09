package model;

public class User {
    private String name;
    private String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void displayUserInfo() {
        System.out.println("User ID: " + userId + ", Name: " + name);
    }
}
