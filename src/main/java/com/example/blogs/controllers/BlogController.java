package com.example.blogs.controllers;

import com.example.blogs.controllers.responseDto.Blog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

     private List<Blog> blogs= Collections.emptyList();

     @GetMapping
     public List<Blog> allBlogs(){
         return blogs;
     }

     public void save(List<Blog> blogs) {
         this.blogs=blogs;
    }

    public void deleteAll() {
        blogs= Collections.emptyList();
    }
}
