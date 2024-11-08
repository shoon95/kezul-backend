package com.kezul.app.user.infrastructure.repository;

import com.kezul.app.user.infrastructure.repository.jpa.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl {

    private final UserJpaRepository userJpaRepository;
}
