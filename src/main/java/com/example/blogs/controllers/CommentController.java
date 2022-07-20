package com.example.blogs.controllers;

import com.example.blogs.Entity.Blog;
import com.example.blogs.Entity.Comment;
import com.example.blogs.services.BlogService;
import com.example.blogs.services.CommentService;
import lombok.RequiredArgsConstructor;
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
}
