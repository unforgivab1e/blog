package com.example.blogs;

import com.example.blogs.Entity.Blog;
import com.example.blogs.repositories.BlogRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureJsonTesters
public class BlogControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private JacksonTester<List<Blog>> blogsJson;


    @Autowired
    private BlogRepository blogRepository;

    @AfterEach
    void tearDown(){
        blogRepository.deleteAll();
    }
    @Test
    void should_return_all_blogs() throws IOException {
        List<Blog> blogs = List.of(
                new Blog("java"),
                new Blog("python"));
        blogRepository.saveAll(blogs);
        final var responseEntity = restTemplate.getForEntity("/blog", String.class);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getHeaders().getContentType()).isEqualTo(MediaType.APPLICATION_JSON);
        final var allBlogs = responseEntity.getBody();
        assertThat(blogsJson.parseObject(allBlogs)).isEqualTo(blogs);
    }
}
