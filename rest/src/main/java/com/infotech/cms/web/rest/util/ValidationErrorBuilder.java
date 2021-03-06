package com.infotech.cms.web.rest.util;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

/**
 * Created by MohammadReza Alagheband on 8/6/16.
 */
public class ValidationErrorBuilder {
    public static ValidationError fromBindingErrors(Errors errors) {
        ValidationError error = new ValidationError("Validation failed. " + errors.getErrorCount() + " error(s)");
        for (ObjectError objectError : errors.getAllErrors()) {
            error.addValidationError(objectError.getDefaultMessage());
        }
        return error;
    }
}
