package com.example.blogs.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "comment")
public class Comment {
    @Id
    private UUID com_id=UUID.randomUUID();


    private UUID blog_id;

    private String comments;


}
