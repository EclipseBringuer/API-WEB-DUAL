package com.gabimiguesamu.appWebDual.controller;

import com.gabimiguesamu.appWebDual.model.Student;
import com.gabimiguesamu.appWebDual.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public ResponseEntity<List<Student>> findAll(){
        List<Student> studentList = studentService.findAll();

        if (studentList != null && !studentList.isEmpty()) {
            return new ResponseEntity<>(studentList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
