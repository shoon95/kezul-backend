package com.kezul.app.user.domain.model.membership;

import com.kezul.app.common.domain.BaseEntity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "post_types")
public class PostType extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    private Type type;
}
