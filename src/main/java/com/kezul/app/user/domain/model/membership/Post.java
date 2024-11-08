package com.kezul.app.user.domain.model.membership;

import com.kezul.app.common.domain.BaseEntity;
import com.kezul.app.user.domain.model.User;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "posts")
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private int age;

    @Column
    private String days;

    @Column
    private String time;

    @Column
    private String period;

    @Column
    private String contents;

    @Column
    private String athleticCareer;
}
