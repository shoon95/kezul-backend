package com.kezul.app.chat.infrastructure.repository;

import com.kezul.app.chat.infrastructure.repository.jpa.ChatRoomJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ChatMessageRepositoryImpl {

    private final ChatRoomJpaRepository chatRoomJpaRepository;
}
