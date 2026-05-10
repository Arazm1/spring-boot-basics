package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Cat;

public interface CatRepository extends JpaRepository<Cat, Long> {
    
}
