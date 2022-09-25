CREATE TABLE IF NOT EXISTS user(
    id int
);

ALTER TABLE user
ADD COLUMN full_name varchar(255);