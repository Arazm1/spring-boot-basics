package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Cat;
import app.repository.CatRepository;

@Service
public class CatService {
    private final CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> getAll() {
        return this.catRepository.findAll();
    }

    public Cat getById(Long id) {
        return this.catRepository.findById(id).orElse(null);
    }

    public Cat save(Cat cat) {
        return this.catRepository.save(cat);
    }

    public void delete(Long id) {
        this.catRepository.deleteById(id);
    }

}
