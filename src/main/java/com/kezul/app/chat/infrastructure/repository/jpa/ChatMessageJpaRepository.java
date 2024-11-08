package com.kezul.app.chat.infrastructure.repository.jpa;

import com.kezul.app.chat.domain.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChatMessageJpaRepository extends JpaRepository<ChatMessage, UUID> {
}
