package com.bugtracker.pareshaan.service;

import com.bugtracker.pareshaan.model.Comment;
import com.bugtracker.pareshaan.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private CommentRepository commentRepository;
    public void addComment(Comment comment){
        commentRepository.save(comment);
    }
    public void deleteComment(Comment comment){
        commentRepository.delete(comment);
    }
    public void updateComment(Comment comment){
        commentRepository.save(comment);
    }
    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }
}
