package com.example.blogs.services;

import com.example.blogs.controllers.BlogController;
import com.example.blogs.controllers.responseDto.Blog;
import com.example.blogs.repositories.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record BlogService(BlogRepository blogRepository) {

    public List<Blog> findBlogs() {
        return blogRepository.findAll();
    }
}