CREATE TABLE comment
(
    com_id          UUID            NOT NULL PRIMARY KEY,
    blog_id         UUID            NOT NULL REFERENCES blog,
    comments   VARCHAR(255)    NOT NULL
);