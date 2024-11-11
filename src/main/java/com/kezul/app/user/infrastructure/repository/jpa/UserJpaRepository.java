package com.kezul.app.user.infrastructure.repository.jpa;

import com.kezul.app.user.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<User, UUID> {

    boolean existsUserByEmail(String email);
    boolean existsUserByPhoneNumber(String phoneNumber);

}
