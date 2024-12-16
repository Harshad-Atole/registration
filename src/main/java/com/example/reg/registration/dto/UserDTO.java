


package com.example.reg.registration.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String name;
    private String email;
    private String mobile;
    private String password;
    private String confirmPassword;
}