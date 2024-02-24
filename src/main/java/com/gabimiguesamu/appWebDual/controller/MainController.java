package com.gabimiguesamu.appWebDual.controller;


import com.gabimiguesamu.appWebDual.model.Task;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String editTask(Model m){

        m.addAttribute("usuario", new Task());

        m.addAttribute("editar", true);

        return "editTask";
    }

    @GetMapping("/new")
    public String newTask(Model m){

        m.addAttribute("usuario", new Task());

        m.addAttribute("editable", false);


        return "editTask";
    }

    @GetMapping("/logout")

    public String logout(HttpServletRequest request) {

        HttpSession session = request.getSession(false);

        if (session != null) {
            session.invalidate();
        }

        return "login";
//
    }



}
