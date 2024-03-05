package ar.edu.unju.fi.maven.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.maven.model.Category;
import ar.edu.unju.fi.maven.model.Product;

public interface IProductRepository extends JpaRepository <Product,Integer> {
    List<Product> findByCategory(Category category);
}
