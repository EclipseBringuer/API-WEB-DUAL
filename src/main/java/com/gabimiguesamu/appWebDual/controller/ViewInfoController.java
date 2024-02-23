package com.gabimiguesamu.appWebDual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info")
public class ViewInfoController {

    @GetMapping("")
    public String loadViweInfoDefault(Model model){
        model.addAttribute("isProfe",true);
        return "viewInfo";
    }

    @GetMapping("/2ndOption")
    public String loadViewInfoEnterprise(Model model){
        model.addAttribute("isProfe",false);
        return "viewInfo";
    }

    @GetMapping("/backwards")
    public String goBack(){
        return "index";
    }
}
