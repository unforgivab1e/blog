/*
package com.example.blogs.controllers;

import com.example.blogs.Entity.Comment;
import com.example.blogs.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService ;

    @GetMapping("/{uuid}")
    @ResponseStatus(HttpStatus.OK)
    public List<Comment> allComments(@PathVariable UUID uuid){
        return commentService.findComments(uuid);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Comment createBlog(@RequestBody Comment comment){
        return commentService.createComment(comment);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteComment(@PathVariable(name = "id")UUID id) throws ChangeSetPersister.NotFoundException {
        commentService.deleteComment(id);
    }
}
*/
