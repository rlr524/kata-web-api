package com.emiyaconsulting.kataWebAPI.guardian;

import com.emiyaconsulting.kataWebAPI.student.Student;
import com.emiyaconsulting.kataWebAPI.student.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GuardianController {
    /**
     * @return ResponseEntity
     */
    @RequestMapping(value = "/guardians")
    public ResponseEntity<ArrayList<Guardian>> getGuardians() {
        GuardianRepository repo = new GuardianRepository();
        return new ResponseEntity<>(repo.getGuardians(), HttpStatus.OK);
    }
}
