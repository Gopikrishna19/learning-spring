package com.gopikrishna19.learningSpring.model;

public class Customer {
    private String firstName;
    private String lastName;
    private String prefix;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}