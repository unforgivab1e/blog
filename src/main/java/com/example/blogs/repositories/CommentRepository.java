package com.example.blogs.repositories;

import com.example.blogs.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Repository
public interface CommentRepository extends JpaRepository<Comment, UUID> {

    @Transactional
    @Query(" from comment where blog_id=?1")
    List<Comment> findAllComment(UUID uuid);
}
