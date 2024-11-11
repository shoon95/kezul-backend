package com.kezul.app.user.infrastructure.repository;

import com.kezul.app.user.domain.repository.CertificationRepository;
import com.kezul.app.user.infrastructure.repository.jpa.CertificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class CertificationRepositoryImpl implements CertificationRepository {

    private final CertificationJpaRepository certificationJpaRepository;
}
