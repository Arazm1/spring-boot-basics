package app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cats")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double weight;
    private String birthdate;

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Double getWeight(){
        return this.weight;
    }

    public String getBirthdate(){
        return this.birthdate;
    }

    public void setId(Long id){
        this.id = id;
    }
    
}
