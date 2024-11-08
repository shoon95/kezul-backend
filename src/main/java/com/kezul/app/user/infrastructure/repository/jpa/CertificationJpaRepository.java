package com.kezul.app.user.infrastructure.repository.jpa;

import com.kezul.app.user.domain.model.trainer.Certification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CertificationJpaRepository extends JpaRepository<Certification, UUID> {
}
