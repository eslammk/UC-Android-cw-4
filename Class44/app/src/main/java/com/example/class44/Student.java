package com.example.class44;

public class Student {


    private String studentName;
    private int studentGrade;
    private int studentAge;
    private int image;

    public Student( String studentName, int studentGrade, int studentAge , int image ) {
        this.image = image;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentAge = studentAge;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}
