package com.safecharge.util;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

@Target({ FIELD, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { BooleanStringValidator.class })
public @interface BooleanString {

    public static String FIELD_VALUE_NOT_ALLOWED = "value is invalid. The allowed values are: (0, 1).";

    public abstract String message() default FIELD_VALUE_NOT_ALLOWED;

    public abstract boolean mandatory() default false;

    public abstract Class<?>[] groups() default {};

    public abstract Class<? extends Payload>[] payload() default {};
}