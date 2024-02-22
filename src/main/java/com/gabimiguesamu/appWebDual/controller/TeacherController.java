package com.gabimiguesamu.appWebDual.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {


    @GetMapping("/backwards")
    public String goBack(){
        return "index";

    }
}
