package com.kezul.app.user.domain.model.trainer;

import com.kezul.app.common.domain.BaseEntity;
import com.kezul.app.user.domain.model.User;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "informations")
public class Information extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(columnDefinition = "test")
    private String contents;
}
