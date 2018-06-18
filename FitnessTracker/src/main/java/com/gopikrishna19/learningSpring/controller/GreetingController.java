package com.gopikrishna19.learningSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
    @RequestMapping(value = "/greeting")
    public String sayHello(Model model) {
        model.addAttribute("pageTitle", "Greeting");
        model.addAttribute("view", "greeting");
        model.addAttribute("greeting", "Greetings, world!");
        return "Master";
    }
}
