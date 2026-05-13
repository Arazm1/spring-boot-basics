--Create the database--
create database springbootbasics1

--Create table basic--
CREATE TABLE basic (
    id INT AUTO_INCREMENT PRIMARY KEY,
    note VARCHAR(255) NOT NULL
);

INSERT INTO basic (note) VALUES ('Spring Boot is pretty cool');
INSERT INTO basic (note) VALUES ('JPA makes database stuff easier');
INSERT INTO basic (note) VALUES ('MariaDB and MySQL are very similar');




CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL DEFAULT 'user'
);


--Password is "yourpassword"
INSERT INTO users (username, password, role)
VALUES ('alice', '$2a$10$g48q7ZyR4b6Iv0g61IQFGOUR5dCv6BfscP9NQalZ1g81lxQnBAhOG', 'user');

