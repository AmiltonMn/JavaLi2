package com.example.demo.dto;

public record PasswordUpdateData(
    String username,
    String password,
    String newPassword,
    String repeatPassword
) {}
