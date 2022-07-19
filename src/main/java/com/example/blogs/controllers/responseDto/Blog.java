package com.example.blogs.controllers.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "blogs")
public class Blog {

    @Id
    private UUID uuid=UUID.randomUUID();

    private String title;

    private String content;

    private LocalDate proposed_dates;

    public Blog(String title) {
        this.title = title;
    }
}
