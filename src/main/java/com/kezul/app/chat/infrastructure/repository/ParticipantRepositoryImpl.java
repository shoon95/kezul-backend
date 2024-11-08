package com.kezul.app.chat.infrastructure.repository;

import com.kezul.app.chat.infrastructure.repository.jpa.ParticipantJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ParticipantRepositoryImpl {

    private final ParticipantJpaRepository participantJpaRepository;
}
