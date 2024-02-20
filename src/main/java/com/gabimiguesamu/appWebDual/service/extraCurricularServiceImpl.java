package com.gabimiguesamu.appWebDual.service;

import com.gabimiguesamu.appWebDual.model.Task;
import com.gabimiguesamu.appWebDual.repository.StudentRepository;
import com.gabimiguesamu.appWebDual.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio de Gestion de actividades extraescolares
 */
@Service
public class extraCurricularServiceImpl implements extraCurricularServiceI{

    /** Inyeccion de repositorio */
    private final TaskRepository taskRepository;

    /** Inyeccion de repositorio */
    private final StudentRepository studentRepository;

    @Autowired
    public extraCurricularServiceImpl(TaskRepository taskRepository, StudentRepository studentRepository) {
        this.taskRepository = taskRepository;
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Task> allStudentActivities(Long id) {
        return studentRepository.findById(id).get().getTaskList();
    }

    @Override
    public Task saveNewActivity(Task k) {
        return taskRepository.save(k);
    }

    @Override
    public Task updateExistentActivity(Task t) {
        return taskRepository.save(t);
    }

    @Override
    public Task deleteNewActivity(Task t) {

        taskRepository.delete(t);
        return t;
    }
}
