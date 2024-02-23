package com.gabimiguesamu.appWebDual.controller;

import com.gabimiguesamu.appWebDual.model.Student;
import com.gabimiguesamu.appWebDual.model.Task;
import com.gabimiguesamu.appWebDual.service.ExtraCurricularServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("")
public class EditTaskController {

    private final ExtraCurricularServiceImpl extraCurricularService;


    public EditTaskController(ExtraCurricularServiceImpl extraCurricularService) {
        this.extraCurricularService = extraCurricularService;
    }

    @GetMapping("/taskEdit")
    public String landPage(){
        return "editAndShow";
    }
    @GetMapping("/backwards")
    public String backwards(){
        return "index";
    }

    @PostMapping("/save")
    public String saveActivity(@ModelAttribute Task t, HttpSession session){

        Student s = (Student) session.getAttribute("alumno");

        s.getTaskList().add(t);

        session.setAttribute("alumno",s);

        return "index";

    }

    @PostMapping("/update")
    public String updateActivity(@ModelAttribute Task t, HttpSession session){

       Student s = (Student) session.getAttribute("alumno");

       s.getTaskList().add(t);

       //TODO comprobar que se le ponga al alumno en la base de datos
       extraCurricularService.saveNewActivity(t);

        return "index";

    }

    @PostMapping("/delete")
    public String deleteActivity(@RequestParam Long taskId, HttpSession session) {

        Student student = (Student) session.getAttribute("alumno");

        student.getTaskList().removeIf(task -> task.getId().equals(taskId));

        session.setAttribute("alumno", student);

        extraCurricularService.deleteExistentActivity(taskId);

        return "index";
    }



}
