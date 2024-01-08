package com.gabimiguesamu.appWebDual.repository;

import com.gabimiguesamu.appWebDual.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query("SELECT t FROM Teacher t WHERE t.id=:id")
    Teacher findTeacherById(Long id);
}
