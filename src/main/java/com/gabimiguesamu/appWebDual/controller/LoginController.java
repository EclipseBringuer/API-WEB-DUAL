package com.gabimiguesamu.appWebDual.controller;
import com.gabimiguesamu.appWebDual.model.Student;
import com.gabimiguesamu.appWebDual.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@RequestMapping("/web")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {

        Student student = loginService.userLogin(email, password);

        if (student != null) {

            model.addAttribute("alumno", student);

            return "pantalla principal";

        } else {

            model.addAttribute("error", "Credenciales inválidas. Por favor, inténtalo de nuevo.");
            return "index";
        }
    }


}
