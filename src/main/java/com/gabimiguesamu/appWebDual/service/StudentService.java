package com.gabimiguesamu.appWebDual.service;


import com.gabimiguesamu.appWebDual.model.Student;
import com.gabimiguesamu.appWebDual.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }
}
