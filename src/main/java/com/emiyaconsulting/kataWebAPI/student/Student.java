package com.emiyaconsulting.kataWebAPI.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.Period;

@Entity
public class Student {
    @Id
    private String studentId;
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private int gradeLevel;
    private String sex;
    private String email;
    private int age;

    public Student(String studentId, String lastName, String firstName, LocalDate dateOfBirth, 
                   int gradeLevel, String sex, String email, int age) {
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.gradeLevel = gradeLevel;
        this.sex = sex;
        this.email = email;
        this.age = calculateStudentAge(dateOfBirth);
    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int calculateStudentAge(LocalDate dateOfBirth) {
        LocalDate today = LocalDate.now();
        
        if (dateOfBirth != null) {
            return Period.between(dateOfBirth, today).getYears();
        } else {
            return 0;
        }
    }
}
