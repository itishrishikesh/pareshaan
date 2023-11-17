package com.bugtracker.pareshaan.repository;

import com.bugtracker.pareshaan.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
