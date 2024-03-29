package com.gabimiguesamu.appWebDual.service;

import com.gabimiguesamu.appWebDual.model.Task;
import com.gabimiguesamu.appWebDual.repository.StudentRepository;
import com.gabimiguesamu.appWebDual.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio de Gestion de actividades extraescolares
 */
@Service
public class ExtraCurricularServiceImpl implements extraCurricularServiceI{

    /** Inyeccion de repositorio */
    private final TaskRepository taskRepository;

    /** Inyeccion de repositorio */
    private final StudentRepository studentRepository;

    @Autowired
    public ExtraCurricularServiceImpl(TaskRepository taskRepository, StudentRepository studentRepository) {
        this.taskRepository = taskRepository;
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Task> allStudentActivities(Long id) {
        return studentRepository.findById(id).get().getTaskList();
    }

    @Override
    public Task singleActivity(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task singleNameActivity(String name) {
        return taskRepository.findByName(name);
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
    public Task deleteExistentActivity(Long id) {
        Task t = null;
        Optional<Task> optionalTask = taskRepository.findById(id);

        if (optionalTask.isPresent()) {
             t = optionalTask.get();
        }
        taskRepository.deleteById(id);

        return t;
    }
}
