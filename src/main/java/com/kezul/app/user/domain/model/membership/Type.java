package com.kezul.app.user.domain.model.membership;

import com.kezul.app.common.domain.BaseEntity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "types")
public class Type extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;
}
