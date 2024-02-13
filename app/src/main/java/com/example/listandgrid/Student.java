package com.example.listandgrid;

// Student class representing a user with an image and name
public class Student {
    // Student image resource ID
    private final int studentImgId;

    // Student name
    private final String name;

    // Constructor to initialize Student object with image and name
    public Student(int studentImgId, String Studentname) {
        this.studentImgId = studentImgId;
        this.name = Studentname;
    }

    // Getter method to retrieve user image resource ID
    public int getStudentImg() {
        return studentImgId;
    }

    // Getter method to retrieve user name
    public String getName() {
        return name;
    }
}
