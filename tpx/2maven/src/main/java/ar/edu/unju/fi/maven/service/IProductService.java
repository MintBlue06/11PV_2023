package ar.edu.unju.fi.maven.service;

import java.util.List;

import ar.edu.unju.fi.maven.model.Category;
import ar.edu.unju.fi.maven.model.Product;

public interface IProductService {
    public void addProduct(Product product);

    public List<Product> getAllProducts();

    public Product findProductById(Integer id);

    public void deleteProduct(Integer id);

    public List<Product> findProductsByCategory(Category category);
}
