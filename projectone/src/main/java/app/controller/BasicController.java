package app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Basic;
import app.service.BasicService;

@RestController
@RequestMapping("/basic")
public class BasicController {

    public BasicService basicService;

    public BasicController(BasicService basicService){
        this.basicService = basicService;
    }

    @GetMapping
    public List<Basic> getAll(){
        return basicService.getAll();
    }

    @GetMapping("/{id}")
    public Basic getById(@PathVariable Integer id){
        return this.basicService.getById(id);
    }

    @PostMapping
    public Basic create(@RequestBody Basic basic){
        return this.basicService.save(basic);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        this.basicService.delete(id);
    }
    
}
