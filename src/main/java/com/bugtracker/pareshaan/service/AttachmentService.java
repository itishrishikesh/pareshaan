package com.bugtracker.pareshaan.service;

import com.bugtracker.pareshaan.model.Attachment;
import com.bugtracker.pareshaan.repository.AttachmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttachmentService {
    private AttachmentRepository attachmentRepository;

    public void addAttachment(Attachment attachment) {
        attachmentRepository.save(attachment);
    }

    public void deleteAttachment(Attachment attachment) {
        attachmentRepository.delete(attachment);
    }

    public List<Attachment> getAllAttachments() {
        return attachmentRepository.findAll();
    }

    public Attachment getAttachmentById(Long id) {
        return attachmentRepository.findById(id).orElse(null);
    }

    public void updateAttachment(Attachment attachment) {
        attachmentRepository.save(attachment);
    }
}