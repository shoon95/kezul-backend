package com.kezul.app.user.application.service;

import com.kezul.app.user.application.dto.response.SignUpResponseDto;
import com.kezul.app.user.application.exceptions.EmailAlreadyExistsException;
import com.kezul.app.user.application.exceptions.PhoneNumberAlreadyExistsException;
import com.kezul.app.user.domain.enums.UserRole;
import com.kezul.app.user.domain.model.User;
import com.kezul.app.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserRepository userRepository;

    /*
        회원가입
     */
    @Override
    public SignUpResponseDto signUp(String username, String password, String email, String phoneNumber, UserRole userRole) {

        signUpVerification(email, phoneNumber);

        User user = User.of(username, bCryptPasswordEncoder.encode(password), email, phoneNumber, userRole);
        User savedUser = userRepository.save(user);

        return new SignUpResponseDto(savedUser);
    }

    private void verifyEmail(String email) {
        if (userRepository.existsUserByEmail(email)) {
            throw new EmailAlreadyExistsException();
        }
    }

    private void verifyPhoneNumber(String phoneNumber) {
        if (userRepository.existsUserByPhoneNumber(phoneNumber)) {
            throw new PhoneNumberAlreadyExistsException();
        }
    }

    private void signUpVerification(String email, String phoneNumber) {
        verifyEmail(email);
        verifyPhoneNumber(phoneNumber);
    }
}
