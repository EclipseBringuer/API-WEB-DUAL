package com.gabimiguesamu.appWebDual.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/enterprise")
public class EnterpriseController {

    @GetMapping("/enterprise/goBack")
    public String goBack() {

        return "index";
    }
    @GetMapping("/preview")
    public String previewEnterprise(Model model) {


        return "enterprise";
    }

}

