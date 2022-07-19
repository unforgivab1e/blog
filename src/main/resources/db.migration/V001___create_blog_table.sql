CREATE TABLE blog
(
    uuid            UUID            NOT NULL PRIMARY KEY,
    title           VARCHAR(255)    NOT NULL,
    content         VARCHAR(255)    NOT NULL,
    proposed_dates  DATE          NOT NULL
);
