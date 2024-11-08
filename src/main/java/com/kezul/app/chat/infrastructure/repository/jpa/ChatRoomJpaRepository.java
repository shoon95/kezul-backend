package com.kezul.app.chat.infrastructure.repository.jpa;

import com.kezul.app.chat.domain.model.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChatRoomJpaRepository extends JpaRepository<ChatRoom, UUID> {
}
