package com.bootweb.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
public class SignupForm {
    @NotBlank
    private String fullName;
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String reTypedPassword;
    @NotBlank
    private String gender;
    @Range(min = 18, max = 100)
    private int age;
}
