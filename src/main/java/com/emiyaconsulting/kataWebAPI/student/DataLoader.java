package com.emiyaconsulting.kataWebAPI.student;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataLoader {
    private final StudentRepository studentRepository;

    public DataLoader(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    @PostConstruct
    private void loadData() {
        studentRepository.saveAll(List.of(
                new Student("202301011","Student", "Jennie",
                LocalDate.of(2009, 7, 12), 9, "Female",
               "jenniestudent@kata.com", 14),
                new Student("202301022", "Ranf", "Madison", 
                        LocalDate.of(2007, 6, 2), 9, "Female", 
                        "madisonranf@gmail.com", 16)
        ));
    }
}
