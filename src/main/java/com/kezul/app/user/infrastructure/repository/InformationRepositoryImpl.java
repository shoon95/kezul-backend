package com.kezul.app.user.infrastructure.repository;

import com.kezul.app.user.infrastructure.repository.jpa.InformationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class InformationRepositoryImpl {

    private final InformationJpaRepository informationJpaRepository;
}
