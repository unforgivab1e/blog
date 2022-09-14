/*
package com.example.blogs.services;

import com.example.blogs.Entity.Blog;
import com.example.blogs.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class  BlogService {

    @Autowired
    private BlogRepository repository;

    public List<Blog> findBlogs(){
        return repository.findAll();
    }

   */
/* public Blog createBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    public Optional<Blog> editBlog(UUID uuid, Blog blog) throws ChangeSetPersister.NotFoundException {
        blogRepository.edit(uuid,blog.getTitle(),blog.getContent(), LocalDate.parse(blog.getProposed_dates()));
        final var task1 = blogRepository.findById(uuid);
        return judgeResult(task1);
    }

    private Optional<Blog> judgeResult(Optional<Blog> blog) throws ChangeSetPersister.NotFoundException {
        if (blog.isEmpty()){
            throw new ChangeSetPersister.NotFoundException();
        }else {
            return blog;
        }
    }

    public void deleteBlog(UUID id) throws ChangeSetPersister.NotFoundException {
        final var blog = blogRepository.findById(id);
        blogRepository.delete(judgeResult(blog).get());
    }*//*


    */
/*public List<Object> findByPage(Pageable pageable) {

    }*//*

}*/
