package com.oreo.reg.patient.dtos;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;

    private long expiresIn;

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }
}
