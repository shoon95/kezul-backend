package com.kezul.app.user.application.dto.response;

import com.kezul.app.user.domain.model.User;

import java.util.UUID;

public record SignUpResponseDto(
        UUID id,
        String email,
        String username,
        String phoneNumber
) {
    public SignUpResponseDto(User user) {
        this(user.getId(), user.getEmail(), user.getUsername(), user.getPhoneNumber());

    }
}
