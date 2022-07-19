package com.example.blogs.controllers;

import com.example.blogs.controllers.responseDto.Blog;
import com.example.blogs.repositories.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/blog")
@RequiredArgsConstructor
public class BlogController {

     private final BlogRepository blogRepository;

     @GetMapping
     public List<Blog> allBlogs(){
         return blogRepository.findAll();
     }

}
