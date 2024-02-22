package com.gabimiguesamu.appWebDual.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {


    @GetMapping("/backwards")
    public String goBack(){
        return "index";

    }
}
