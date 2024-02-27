package ar.edu.unju.fi.maven.model;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotBlank;

@Component
public class Category {
    private Integer id;

    @NotBlank
    private String name;
    
    public Category(String name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
