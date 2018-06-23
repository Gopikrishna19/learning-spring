package com.gopikrishna19.learningSpring.controller;

import com.gopikrishna19.learningSpring.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;

@Controller
@SessionAttributes("goal")
public class GoalController {
    @RequestMapping(value = "/add-goal", method = RequestMethod.GET)
    public String addGoal(Model model) {
        Map map = model.asMap();
        Goal goal;

        if (map.get("goal") == null) {
            goal = new Goal();
            goal.setMinutes(10);
        } else {
            goal = (Goal) map.get("goal");
        }

        model.addAttribute("pageTitle", "Add Goal");
        model.addAttribute("view", "add-goal");
        model.addAttribute("goal", goal);
        return "Master";
    }

    @RequestMapping(value = "/add-goal", method = RequestMethod.POST)
    public String updateGoal(@ModelAttribute("goal") Goal goal, Model model) {
        return "redirect:add-minutes";
    }
}
