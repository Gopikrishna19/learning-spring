package com.gopikrishna19.learningSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String home(Model model)  {
        model.addAttribute("view", "index");
        return "Master";
    }
}
