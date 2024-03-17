package com.emiyaconsulting.kataWebAPI.student;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentRepository {
    private final ArrayList<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
        this.students.add(new Student("202301011","Student", "Jennie",
                LocalDate.of(2009, 7, 12), 9, "Female",
                "jenniestudent@kata.com", 14));
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
