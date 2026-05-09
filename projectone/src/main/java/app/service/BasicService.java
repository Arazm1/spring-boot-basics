package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Basic;
import app.repository.BasicRepository;

@Service
public class BasicService {

    public final BasicRepository basicRepository;

    public BasicService(BasicRepository basicRepository){
        this.basicRepository = basicRepository;
    }


    public List<Basic> getAll(){
        return this.basicRepository.findAll();
    }

    public Basic getById(Integer id){
        return this.basicRepository.findById(id).orElse(null);
    }

    public Basic save(Basic basic){
        return basicRepository.save(basic);
    }

    public void delete(Integer id){
        basicRepository.deleteById(id);
    }
    
}
