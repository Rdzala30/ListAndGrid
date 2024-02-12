package com.example.listandgrid;

// User class representing a user with an image and name
public class User {
    // User image resource ID
    private final int userImgId;

    // User name
    private final String name;

    // Constructor to initialize User object with image and name
    public User(int userImgId, String name) {
        this.userImgId = userImgId;
        this.name = name;
    }

    // Getter method to retrieve user image resource ID
    public int getUserImg() {
        return userImgId;
    }

    // Getter method to retrieve user name
    public String getName() {
        return name;
    }
}
