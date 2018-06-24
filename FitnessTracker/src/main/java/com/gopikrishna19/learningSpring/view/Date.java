package com.gopikrishna19.learningSpring.view;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Date {
    Class<?>[] groups() default {};

    String message() default "{Date}";

    Class<? extends Payload>[] payload() default {};
}
