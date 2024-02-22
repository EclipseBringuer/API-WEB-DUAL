package com.gabimiguesamu.appWebDual.controller;
import com.gabimiguesamu.appWebDual.model.Student;
import com.gabimiguesamu.appWebDual.service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/web")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String landPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) {

        Student student = loginService.userLogin(email, password);

        if (student != null) {
            model.addAttribute("alumno", student);
            session.setAttribute("alumno",student);
            return "index";
        } else {
            model.addAttribute("error", "Credenciales inválidas. Por favor, inténtalo de nuevo.");
            return "login";
        }
    }
}
