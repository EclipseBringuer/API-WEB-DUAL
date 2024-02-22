package com.gabimiguesamu.appWebDual.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnterpriseController {

    @GetMapping("/enterprise/goBack")
    public String goBack() {

        return "index";
    }
}
