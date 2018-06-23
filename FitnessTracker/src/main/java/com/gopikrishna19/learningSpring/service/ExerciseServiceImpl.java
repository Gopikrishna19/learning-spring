package com.gopikrishna19.learningSpring.service;

import com.gopikrishna19.learningSpring.model.Activity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {
    @Override
    public List<Activity> getAllActivities() {
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Run"));
        activities.add(new Activity("Bike"));
        activities.add(new Activity("Swim"));
        return activities;
    }
}
