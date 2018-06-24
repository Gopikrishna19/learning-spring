package com.gopikrishna19.learningSpring.controller;

import com.gopikrishna19.learningSpring.model.Activity;
import com.gopikrishna19.learningSpring.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActivitiesController {
    private ExerciseService exerciseService;

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public List<Activity> getAllActivities() {
        return exerciseService.getAllActivities();
    }

    @Autowired
    public void setExerciseService(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }
}
