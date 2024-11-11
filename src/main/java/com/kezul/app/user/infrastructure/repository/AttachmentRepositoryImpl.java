package com.kezul.app.user.infrastructure.repository;

import com.kezul.app.user.domain.repository.AttachmentRepository;
import com.kezul.app.user.infrastructure.repository.jpa.AttachmentJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class AttachmentRepositoryImpl implements AttachmentRepository {

    private final AttachmentJpaRepository attachmentJpaRepository;
}
