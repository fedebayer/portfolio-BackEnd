package com.portfolio.fb.security.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter @Setter
public class LoginUser {
    @NotBlank @Email
    private String email;
    @NotBlank
    private String password;
}
