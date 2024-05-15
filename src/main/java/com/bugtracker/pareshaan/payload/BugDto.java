package com.bugtracker.pareshaan.payload;

import com.bugtracker.pareshaan.model.Attachment;
import com.bugtracker.pareshaan.model.Comment;
import com.bugtracker.pareshaan.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BugDto {
    private Long id;
    private String summary;
    private String description;
    private List<String> steps;
    private User reporter;
    private User assigned;
    private List<Comment> comments;
    private List<Attachment> attachments;
}
