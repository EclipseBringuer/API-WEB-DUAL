package com.gabimiguesamu.appWebDual.controller;

import com.gabimiguesamu.appWebDual.model.Student;
import com.gabimiguesamu.appWebDual.model.Task;
import com.gabimiguesamu.appWebDual.service.ExtraCurricularServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("taskEdit")
public class EditTaskController {

    private final ExtraCurricularServiceImpl extraCurricularService;


    public EditTaskController(ExtraCurricularServiceImpl extraCurricularService) {
        this.extraCurricularService = extraCurricularService;
    }

    @GetMapping("/backwards")
    public String backwards(){
        return "index";
    }

    @PostMapping("/save")
    public String saveActivity(@RequestBody Task t, HttpSession session){

        Student s = (Student) session.getAttribute("alumno");

        s.getTaskList().add(t);

        session.setAttribute("alumno",s);

        return "index";

    }

    @PostMapping("/update")
    public String updateActivity(@RequestBody Task t, HttpSession session){

        //TODO terminar el update

        return "index";

    }





}
