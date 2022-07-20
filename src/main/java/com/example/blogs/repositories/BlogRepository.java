package com.example.blogs.repositories;

import com.example.blogs.Entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.UUID;

@Repository
public interface BlogRepository extends JpaRepository<Blog, UUID> {
    @Modifying
    @Transactional
    @Query("update blog  set title=?2,content=?3,proposed_dates=?4 where uuid=?1")
    void edit(UUID uuid, String title, String content, LocalDate proposed_dates);
}
