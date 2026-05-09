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
