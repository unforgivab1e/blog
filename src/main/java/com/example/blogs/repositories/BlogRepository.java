package com.example.blogs.repositories;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.example.blogs.Entity.Blog;
import com.example.blogs.RequestDto.BlogRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class BlogRepository {

    /*@Autowired
    private  DynamoDBMapper dynamoDBMapper;*/

    private final DynamoDBMapper dynamoDBMapper;

    public BlogRepository(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public List<Blog> findAll() {
        return dynamoDBMapper.scan(Blog.class, new DynamoDBScanExpression());
    }

    public BlogRequestDto save(BlogRequestDto blog){

        dynamoDBMapper.save(Blog.fromModel(blog));
        return blog;
    }

    public Blog getBlogById(String blogId,String title){
        return dynamoDBMapper.load(Blog.class,blogId,title);
    }

    public void delete(String blogId,String title){
        Blog emp=dynamoDBMapper.load(Blog.class,blogId,title);
        dynamoDBMapper.delete(emp);


    }

    public Blog update(Blog blog){
        dynamoDBMapper.save(blog);
        return blog;
    }

}