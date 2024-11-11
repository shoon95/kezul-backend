package com.kezul.app.user.infrastructure.repository;

import com.kezul.app.user.domain.repository.InformationRepository;
import com.kezul.app.user.infrastructure.repository.jpa.InformationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class InformationRepositoryImpl implements InformationRepository {

    private final InformationJpaRepository informationJpaRepository;
}
