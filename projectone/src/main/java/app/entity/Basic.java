package app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "basic")
public class Basic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String note;

    public Long getId(){
        return this.id;
    }

    public String getNote(){
        return this.note;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setNote(String note){
        this.note = note;
    }
   
}