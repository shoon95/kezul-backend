package com.kezul.app.user.application.service;

import com.kezul.app.user.application.dto.response.SignUpResponseDto;
import com.kezul.app.user.application.exceptions.EmailAlreadyExistsException;
import com.kezul.app.user.application.exceptions.PhoneNumberAlreadyExistsException;
import com.kezul.app.user.domain.enums.UserRole;
import com.kezul.app.user.domain.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:application-dev.properties")
class AuthServiceImplIntegrationTest {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthService authService;


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
        String email = "sjhty1234@naver.com";
        String phoneNumber = "01093614813";
        UserRole userRole = UserRole.MEMBERSHIP;
        authService.signUp(username, password, email, phoneNumber, userRole);
        Assertions.assertThatThrownBy(() -> authService.signUp(username, password, email, phoneNumber, userRole)).isInstanceOf(EmailAlreadyExistsException.class);
    }

    @Test
    void signUpFailByPhoneNumber() {
        String username = "sanghoon";
        String password = "asdf1234!";
        String email = "sjhty1235@naver.com";
        String phoneNumber = "01093614810";
        UserRole userRole = UserRole.MEMBERSHIP;
        authService.signUp(username, password, email, phoneNumber, userRole);
        String email2 = "sjhty1237@naver.com";
        Assertions.assertThatThrownBy(() -> authService.signUp(username, password, email2, phoneNumber, userRole)).isInstanceOf(PhoneNumberAlreadyExistsException.class);

    }
}
