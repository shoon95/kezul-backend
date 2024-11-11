package com.kezul.app.user.domain.model;

import com.kezul.app.common.domain.BaseEntity;
import com.kezul.app.user.domain.enums.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private UserRole role;


    public static User of(String username, String password, String email, String phoneNumber, UserRole userRole) {
        User user = new User();
        user.username = username;
        user.password = password;
        user.email = email;
        user.phoneNumber = phoneNumber;
        user.role = userRole;
        return user;
    }

}
