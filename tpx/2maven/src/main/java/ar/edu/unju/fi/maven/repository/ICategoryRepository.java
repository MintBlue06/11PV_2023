package ar.edu.unju.fi.maven.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.maven.model.Category;

public interface ICategoryRepository extends JpaRepository <Category,Integer> {
    
}
