package com.kezul.app.user.application.dto.request;

import com.kezul.app.user.domain.enums.UserRole;

public record SignUpRequestDto(
        String username,
        String password,
        String email,
        String phoneNumber,
        UserRole userRole
        ) {
}
