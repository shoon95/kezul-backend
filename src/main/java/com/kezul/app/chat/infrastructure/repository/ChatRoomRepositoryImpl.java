package com.kezul.app.chat.infrastructure.repository;

import com.kezul.app.chat.infrastructure.repository.jpa.ChatRoomJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ChatRoomRepositoryImpl {

    private final ChatRoomJpaRepository chatRoomJpaRepository;

}
