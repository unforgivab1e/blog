package com.example.blogs;

import com.example.blogs.controllers.responseDto.Blog;
import com.example.blogs.repositories.BlogRepository;
import com.example.blogs.services.BlogService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BlogServiceTest {

    @Mock
    private BlogRepository blogRepository;
    @InjectMocks
    private BlogService blogService;


    @Test
    void should_return_all_blogs(){
        final var blogs = List.of(
                new Blog("java"),
                new Blog("python")
        );
        when(blogRepository.findAll()).thenReturn(blogs);

        final var foundBlog=blogService.findBlogs();

        assertThat(foundBlog).isEqualTo(blogs);

        verify(blogRepository).findAll();
    }
}