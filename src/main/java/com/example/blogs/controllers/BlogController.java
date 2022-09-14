package com.example.blogs.controllers;

import com.example.blogs.Entity.Blog;
import com.example.blogs.RequestDto.BlogRequestDto;
import com.example.blogs.repositories.BlogRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
@RequiredArgsConstructor
public class BlogController {

    @Autowired
   final BlogRepository repository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
     public Iterable<Blog> allBlogs(){
         return repository.findAll();

     }
    @GetMapping(value = "/{id}/{title}")
    @ResponseStatus(HttpStatus.OK)
    public Blog gitOneBlogs(@PathVariable(name = "id")String id, @PathVariable(name = "title")String title){
        return  repository.getBlogById(id,title);

    }

     @PostMapping("/save")
     @ResponseStatus(HttpStatus.CREATED)
    public BlogRequestDto saveBlog(@RequestBody BlogRequestDto blog){
        return repository.save(blog);
     }

    @DeleteMapping(value = "delete/{id}/{title}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable(name = "id")String id, @PathVariable(name = "title")String title){

        repository.delete(id,title);
    }



    @PutMapping("/edit")
    @ResponseStatus(HttpStatus.OK)
    public Blog editBlog( @RequestBody Blog blog)  {

        return repository.update(blog);
    }



   /* @GetMapping(value = "/{pageNum}")
    public List<Blog> pageList(@PathVariable(name = "pageNum")int pageNum){
        Sort sort = Sort.by(Sort.Direction.DESC,"proposed_dates");
        Pageable pageable = PageRequest.of(pageNum,3,sort);
        return (List<Blog>) blogService.findByPage(pageable).get();
    }*/
}
