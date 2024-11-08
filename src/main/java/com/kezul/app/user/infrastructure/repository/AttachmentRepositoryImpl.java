package com.kezul.app.user.infrastructure.repository;

import com.kezul.app.user.infrastructure.repository.jpa.AttachmentJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class AttachmentRepositoryImpl {

    private final AttachmentJpaRepository attachmentJpaRepository;
}
