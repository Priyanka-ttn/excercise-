package com.ttm.bootcamp;

import java.util.List;

public interface Service2 {
    void addStudent(Student student);
    void deleteStudent(int id);
    boolean isStudentPassed(int id);
    Student getStudent(int id);
    List getAllStudent();

}
