package com.portfolio.fb.security.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JwtDto {
    private String token;

    public JwtDto() {
    }

    public JwtDto(String token) {
        this.token = token;
    }
}
