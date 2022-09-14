/*
package com.example.blogs.services;

import com.example.blogs.Entity.Blog;
import com.example.blogs.Entity.Comment;
import com.example.blogs.repositories.BlogRepository;
import com.example.blogs.repositories.CommentRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public record CommentService(CommentRepository commentRepository) {
    public List<Comment> findComments(UUID uuid) {
        return commentRepository.findAllComment(uuid);
    }

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    private Optional<Comment> judgeResult(Optional<Comment> comment) throws ChangeSetPersister.NotFoundException {
        if (comment.isEmpty()){
            throw new ChangeSetPersister.NotFoundException();
        }else {
            return comment;
        }
    }

    public void deleteComment(UUID id) throws ChangeSetPersister.NotFoundException {
        final var comment = commentRepository.findById(id);
        commentRepository.delete(judgeResult(comment).get());
    }


}
*/
