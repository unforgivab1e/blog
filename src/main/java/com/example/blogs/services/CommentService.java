package com.example.blogs.services;

import com.example.blogs.Entity.Comment;
import com.example.blogs.repositories.BlogRepository;
import com.example.blogs.repositories.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public record CommentService(CommentRepository commentRepository) {
    public List<Comment> findComments(UUID uuid) {
        return commentRepository.findAllComment(uuid);
    }
}
