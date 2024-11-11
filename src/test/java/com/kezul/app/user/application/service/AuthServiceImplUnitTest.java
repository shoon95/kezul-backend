package com.kezul.app.user.application.service;

import com.kezul.app.user.application.UserFakeRepository;
import com.kezul.app.user.application.dto.response.SignUpResponseDto;
import com.kezul.app.user.application.exceptions.EmailAlreadyExistsException;
import com.kezul.app.user.application.exceptions.PhoneNumberAlreadyExistsException;
import com.kezul.app.user.domain.enums.UserRole;
import com.kezul.app.user.domain.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class AuthServiceImplUnitTest {

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    UserRepository userRepository = UserFakeRepository.getInstance();

    AuthService authService = new AuthServiceImpl(bCryptPasswordEncoder, userRepository);

    @BeforeEach
    void clear() {
        ((UserFakeRepository) userRepository).clear();
    }
    @Test
    void signUpSuccessTest() {
        String username = "sanghoon";
        String password = "asdf1234!";
        String email = "sjhty123@naver.com";
        String phoneNumber = "01093614817";
        UserRole userRole = UserRole.MEMBERSHIP;
        SignUpResponseDto signUpResponseDto = authService.signUp(username, password, email, phoneNumber, userRole);
        Assertions.assertThat(signUpResponseDto.email()).isEqualTo(email);
    }

    @Test
    void signUpFailByEmail() {
        String username = "sanghoon";
        String password = "asdf1234!";
        String email = "sjhty123@naver.com";
        String phoneNumber = "01093614813";
        UserRole userRole = UserRole.MEMBERSHIP;
        authService.signUp(username, password, email, phoneNumber, userRole);
        Assertions.assertThatThrownBy(() -> authService.signUp(username, password, email, phoneNumber, userRole)).isInstanceOf(EmailAlreadyExistsException.class);
    }

    @Test
    void signUpFailByPhoneNumber() {
        String username = "sanghoon";
        String password = "asdf1234!";
        String email = "sjhty123@naver.com";
        String phoneNumber = "01093614813";
        UserRole userRole = UserRole.MEMBERSHIP;
        authService.signUp(username, password, email, phoneNumber, userRole);
        String email2 = "sjhty1234@naver.com";
        Assertions.assertThatThrownBy(() -> authService.signUp(username, password, email2, phoneNumber, userRole)).isInstanceOf(PhoneNumberAlreadyExistsException.class);

    }
}