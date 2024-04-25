package com.emiyaconsulting.kataWebAPI.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController()
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * @return ResponseEntity
     */
    @GetMapping()
    Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }

    /**
     * @param id - ID of the student
     * @return Optional
     */
    @GetMapping("/{id}")
    Optional<Student> getStudent(@PathVariable String id) {
        return studentRepository.findById(id);
    }
}
