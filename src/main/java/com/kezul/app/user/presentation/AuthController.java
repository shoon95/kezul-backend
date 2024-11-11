package com.kezul.app.user.presentation;

import com.kezul.app.user.application.dto.request.SignUpRequestDto;
import com.kezul.app.user.application.dto.response.SignUpResponseDto;
import com.kezul.app.user.application.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/sign-up")
    public SignUpResponseDto signUp(@RequestBody SignUpRequestDto signUpRequestDto) {
        return authService.signUp(signUpRequestDto.username(), signUpRequestDto.password(), signUpRequestDto.email(), signUpRequestDto.phoneNumber(), signUpRequestDto.userRole());
    }
}
