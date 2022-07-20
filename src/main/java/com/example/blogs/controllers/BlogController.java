package com.example.blogs.controllers;

import com.example.blogs.Entity.Blog;
import com.example.blogs.services.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/blog")
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService ;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
     public List<Blog> allBlogs(){
         return blogService.findBlogs();

     }

     @PostMapping
     @ResponseStatus(HttpStatus.CREATED)
     public Blog createBlog(@RequestBody Blog blog){
        return blogService.createBlog(blog);
     }

    @PutMapping("/{blogId}/edit")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Blog> editBlog(
            @PathVariable UUID blogId,
            @RequestBody Blog blog) throws ChangeSetPersister.NotFoundException {

        return blogService.editBlog(blogId,blog);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable(name = "id")UUID id) throws ChangeSetPersister.NotFoundException {
        blogService.deleteBlog(id);
    }
}
