package com.emiyaconsulting.kataWebAPI.student;

public class Student {
    private String studentId;
    private String lastName;
    private String firstName;
    private long dateOfBirth;
    private int gradeLevel;
    private String sex;
    private String email;

    public Student(String studentId, String lastName, String firstName, long dateOfBirth, int gradeLevel, String sex, String email) {
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.gradeLevel = gradeLevel;
        this.sex = sex;
        this.email = email;
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

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
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
}
