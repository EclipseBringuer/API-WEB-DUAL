package com.gabimiguesamu.appWebDual.repository;

import com.gabimiguesamu.appWebDual.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByEmailAndPassword(String email);

}
