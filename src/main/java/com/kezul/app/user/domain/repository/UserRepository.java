package com.kezul.app.user.domain.repository;

import com.kezul.app.user.domain.model.User;

public interface UserRepository {

    boolean existsUserByEmail(String email);
    boolean existsUserByPhoneNumber(String phoneNumber);

    User save(User user);

}
