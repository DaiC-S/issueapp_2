CREATE TABLE IF NOT EXISTS issues (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(256) NOT NULL,
    content VARCHAR(256) NOT NULL,
    deadline VARCHAR(256) NOT NULL,
    priority VARCHAR(256) NOT NULL
);