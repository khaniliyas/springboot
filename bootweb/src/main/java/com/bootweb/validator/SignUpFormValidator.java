package com.bootweb.validator;

import com.bootweb.form.SignupForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SignUpFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(SignupForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SignupForm signupForm = (SignupForm) target;
        if(!errors.hasFieldErrors("password") && !errors.hasFieldErrors("reTypedPassword")){
           if(!signupForm.getPassword().equals(signupForm.getReTypedPassword())){
               errors.rejectValue("reTypedPassword", "password.mismatch");
           }
        }
    }
}
