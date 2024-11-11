package com.kezul.app.user.application;


import com.kezul.app.user.domain.model.User;
import com.kezul.app.user.domain.repository.UserRepository;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class UserFakeRepository implements UserRepository {

    private final Map<UUID, User> memoryRepository = new HashMap<>();

    private static class LazyHolder {
        private static UserFakeRepository instance = new UserFakeRepository();
    }
    private UserFakeRepository() {

    }

    public static UserFakeRepository getInstance() {
        return LazyHolder.instance;
    }
    @Override
    public boolean existsUserByEmail(String email) {
        return memoryRepository.values().stream()
                .anyMatch(user -> email.equals(user.getEmail()));
    }

    @Override
    public boolean existsUserByPhoneNumber(String phoneNumber) {
        return memoryRepository.values().stream()
                .anyMatch(user -> phoneNumber.equals(user.getPhoneNumber()));
    }

    @Override
    public User save(User user) {
        if (user.getId() == null) {
            UUID uuid = UUID.randomUUID();
            ReflectionTestUtils.setField(user, "id", uuid);
        }
        memoryRepository.put(user.getId(), user);
        return user;
    }

    public void clear() {
        memoryRepository.clear();
    }
}
