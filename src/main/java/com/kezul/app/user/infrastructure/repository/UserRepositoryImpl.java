package com.kezul.app.user.infrastructure.repository;

import com.kezul.app.user.domain.model.User;
import com.kezul.app.user.domain.repository.UserRepository;
import com.kezul.app.user.infrastructure.repository.jpa.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    @Override
    public boolean existsUserByEmail(String email) {
        return userJpaRepository.existsUserByEmail(email);
    }

    @Override
    public boolean existsUserByPhoneNumber(String phoneNumber) {
        return userJpaRepository.existsUserByPhoneNumber(phoneNumber);
    }

    @Override
    public User save(User user) {
        return userJpaRepository.save(user);
    }
}
