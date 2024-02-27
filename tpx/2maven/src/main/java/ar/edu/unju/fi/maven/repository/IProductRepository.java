package ar.edu.unju.fi.maven.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.maven.model.Product;

public interface IProductRepository extends JpaRepository <Product,Integer> {
    
}
