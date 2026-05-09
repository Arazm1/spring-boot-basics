package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Basic;

public interface BasicRepository extends JpaRepository<Basic, Integer>{
}
