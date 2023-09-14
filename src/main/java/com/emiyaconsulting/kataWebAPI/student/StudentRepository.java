package com.emiyaconsulting.kataWebAPI.student;

import java.util.ArrayList;

public class StudentRepository {
    private ArrayList<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<Student>();
        this.students.add(new Student("Student", "Jennie", 1222844400L,
                9, "Female", "jenniestudent@kata.com"));
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
