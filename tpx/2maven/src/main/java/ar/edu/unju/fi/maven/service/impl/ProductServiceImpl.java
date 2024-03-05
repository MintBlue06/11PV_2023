package ar.edu.unju.fi.maven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.fi.maven.model.Category;
import ar.edu.unju.fi.maven.model.Product;
import ar.edu.unju.fi.maven.repository.IProductRepository;
import ar.edu.unju.fi.maven.service.IProductService;

public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private Product product;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> listProducts = (List<Product>) productRepository.findAll();
        return listProducts;
    }

    @Override
    public Product findProductById(Integer id) {
        product = productRepository.findById(id).get();
        return product;
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    } 

    @Override
    public List<Product> findProductsByCategory(Category category) {
        List<Product> listProducts = (List<Product>) productRepository.findByCategory(category);
        return listProducts;
    }
}
