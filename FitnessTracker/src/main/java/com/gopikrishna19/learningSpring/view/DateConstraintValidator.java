package com.gopikrishna19.learningSpring.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateConstraintValidator implements ConstraintValidator<Date, String> {
    public void initialize(Date date) {
    }

    public boolean isValid(String dateField, ConstraintValidatorContext context) {
        if (dateField == null) return false;

        return dateField.matches("\\d\\d-\\d\\d-\\d\\d\\d\\d");
    }
}
