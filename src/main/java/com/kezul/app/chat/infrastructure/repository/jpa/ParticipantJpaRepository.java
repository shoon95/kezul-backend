package com.kezul.app.chat.infrastructure.repository.jpa;

import com.kezul.app.chat.domain.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParticipantJpaRepository extends JpaRepository<Participant, UUID> {
}
