package com.gabimiguesamu.appWebDual.service;

import com.gabimiguesamu.appWebDual.model.Teacher;
import com.gabimiguesamu.appWebDual.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> findAll(){
        return teacherRepository.findAll();
    }

    public Teacher findById(Long id){
        return teacherRepository.findTeacherById(id);
    }
}
