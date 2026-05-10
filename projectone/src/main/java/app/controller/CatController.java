package app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Cat;
import app.service.CatService;

@RestController
@RequestMapping("/api/v1/cat")
public class CatController {
    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping
    public List<Cat> getAll() {
        return this.catService.getAll();
    }

    @GetMapping("/{id}")
    public Cat getById(@PathVariable Long id) {
        return this.catService.getById(id);
    }

    @PostMapping
    public Cat create(@RequestBody Cat cat) {
        return this.catService.save(cat);
    }

    @PutMapping("/{id}")
    public Map<String, String> update(@PathVariable Long id, @RequestBody Cat cat){
        cat.setId(id);
        catService.save(cat);
        return Map.of("message", "Cat item updated.");
    }

    @DeleteMapping("/{id}")
    public Map<String, String> delete(@PathVariable Long id){
        catService.delete(id);
        return Map.of("message", "Cat item deleted.");

    }

}
