package com.gopikrishna19.learningSpring.model;

import com.gopikrishna19.learningSpring.view.Date;

public class Exercise {
    private String activity;
    @Date
    private String date;
    private int minutes;

    public String getActivity() {
        return activity;
    }

    public String getDate() {
        return date;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
