package com.kezul.app.user.infrastructure.repository;

import com.kezul.app.user.domain.repository.ProgramRepository;
import com.kezul.app.user.infrastructure.repository.jpa.ProgramJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProgramRepositoryImpl implements ProgramRepository {

    private final ProgramJpaRepository programJpaRepository;
}
