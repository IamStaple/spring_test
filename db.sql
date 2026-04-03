CREATE TABLE IF NOT EXISTS enriched_user 
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(60),
    email VARCHAR(100),
    department VARCHAR(30),
    last_updated VARCHAR(150)
);