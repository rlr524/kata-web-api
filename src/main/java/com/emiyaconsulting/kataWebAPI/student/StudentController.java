package com.emiyaconsulting.kataWebAPI.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {
    /**
     * @return ResponseEntity
     */
    @RequestMapping(value = "/students")
    public ResponseEntity<ArrayList<Student>> getStudents() {
        StudentRepository repo = new StudentRepository();
        return new ResponseEntity<>(repo.getStudents(), HttpStatus.OK);
    }
}
