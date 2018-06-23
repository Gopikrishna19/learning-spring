package com.gopikrishna19.learningSpring.controller;

import com.gopikrishna19.learningSpring.model.Activity;
import com.gopikrishna19.learningSpring.model.Exercise;
import com.gopikrishna19.learningSpring.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MinutesController {
    private ExerciseService exerciseService;

    @RequestMapping(value = "/add-minutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise, Model model) {
        System.out.println(exercise.getActivity());
        model.addAttribute("pageTitle", "Add Minutes");
        model.addAttribute("view", "add-minutes");
        return "Master";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody
    List<Activity> getAllActivities() {
        return exerciseService.getAllActivities();
    }

    @Autowired
    public void setExerciseService(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }
}
