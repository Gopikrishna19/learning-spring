package com.gopikrishna19.learningSpring.controller;

import com.gopikrishna19.learningSpring.model.Activity;
import com.gopikrishna19.learningSpring.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MinutesController {
    @RequestMapping(value = "/add-minutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise, Model model) {
        System.out.println(exercise.getActivity());
        model.addAttribute("pageTitle", "Add Minutes");
        model.addAttribute("view", "add-minutes");
        return "Master";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody List<Activity> getAllActivities() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Run"));
        activities.add(new Activity("Bike"));
        activities.add(new Activity("Swim"));
        return activities;
    }
}
