package com.gabimiguesamu.appWebDual.service;

import com.gabimiguesamu.appWebDual.model.Task;

import java.util.List;

public interface extraCurricularServiceI {

    /** Obtener todas las tareas del alumno */
    List<Task> allStudentActivities(Long id);

    /* Obtener una sola actividad por el id */
    Task singleActivity(Long id);

    /* Obtener una sola actividad por el nombre */
    Task singleNameActivity(String name);

    /** Guardar una nueva actividad*/
    Task  saveNewActivity(Task k);

    /** Actualizar una actividad */
    Task  updateExistentActivity(Task t);

    /** Borrar una nueva actividad */
    Task  deleteExistentActivity(Long id);



}
