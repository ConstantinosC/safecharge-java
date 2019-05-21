package com.safecharge.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BooleanStringValidator implements ConstraintValidator<BooleanString, String> {

    private boolean mandatory;

    @Override
    public void initialize(BooleanString booleanString) {
        this.mandatory = booleanString.mandatory();
    }

    @Override
    public boolean isValid(String fieldValue, ConstraintValidatorContext context) {

        if (mandatory && fieldValue == null) {
            return false;
        }

        return (fieldValue == null || "0".equals(fieldValue) || "1".equals(fieldValue));
    }
}
