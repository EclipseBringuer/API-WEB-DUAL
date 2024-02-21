package com.gabimiguesamu.appWebDual.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/profe")
    public String toTeacherView(){
        return "teacher";
    }

    @GetMapping("/empresa")
    public String toEnterpriseView(){
        return "enterprise";
    }

    @GetMapping("/edit")
    public String editTask(){
        return "editTask";
    }




}
