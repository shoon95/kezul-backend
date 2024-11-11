package com.kezul.app.user.application.service;

import com.kezul.app.user.application.dto.response.SignUpResponseDto;
import com.kezul.app.user.domain.enums.UserRole;

public interface AuthService {
    SignUpResponseDto signUp(String username, String password, String email, String phoneNumber, UserRole userRole);
}
