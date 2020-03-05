package com.ttm.bootcamp;

public class Student {
    private int studentID;
    private String studentName;
    private float marks;

    public Student(int studentID, String studentName, float marks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}
