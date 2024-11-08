package com.kezul.app.chat.domain.model;

import com.kezul.app.common.domain.BaseEntity;
import com.kezul.app.user.domain.model.User;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "chat_messages")
public class ChatMessage extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chatroom_id")
    private ChatRoom chatroom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender")
    private User sender;

    @Column(nullable = false)
    private boolean read;

    @Column(nullable = false, columnDefinition = "text")
    private String contents;
}
