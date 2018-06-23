package com.gopikrishna19.learningSpring.controller;

import com.gopikrishna19.learningSpring.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {
    @RequestMapping(value = "/add-minutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise, Model model) {
        model.addAttribute("pageTitle", "Add Minutes");
        model.addAttribute("view", "add-minutes");
        return "Master";
    }
}
