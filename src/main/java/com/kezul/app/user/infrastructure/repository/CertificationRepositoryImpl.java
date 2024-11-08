package com.kezul.app.user.infrastructure.repository;

import com.kezul.app.user.infrastructure.repository.jpa.CertificationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class CertificationRepositoryImpl {

    private final CertificationJpaRepository certificationJpaRepository;
}
