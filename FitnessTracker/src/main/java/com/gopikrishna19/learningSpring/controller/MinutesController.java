package com.gopikrishna19.learningSpring.controller;

import com.gopikrishna19.learningSpring.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class MinutesController {

    @RequestMapping(value = "/add-minutes", method = RequestMethod.GET)
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise, Model model) {
        model.addAttribute("pageTitle", "Add Minutes");
        model.addAttribute("view", "add-minutes");
        return "Master";
    }

    @RequestMapping(value = "/add-minutes", method = RequestMethod.POST)
    public String updateMinutes(@Valid @ModelAttribute("exercise") Exercise exercise, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("pageTitle", "Add Minutes");
            model.addAttribute("view", "add-minutes");
            return "Master";
        } else {
            return "redirect:/";
        }
    }
}
