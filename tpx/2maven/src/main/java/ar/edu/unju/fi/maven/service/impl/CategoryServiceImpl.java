package ar.edu.unju.fi.maven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.maven.model.Category;
import ar.edu.unju.fi.maven.repository.ICategoryRepository;
import ar.edu.unju.fi.maven.service.ICategoryService;

@Service("categoryServiceImpl")
public class CategoryServiceImpl implements ICategoryService{
    @Autowired
    private ICategoryRepository categoryRepository;

    @Autowired
    private Category category;

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }
    @Override
    public List<Category> getAllCategories() {
        List<Category> listCategories = (List<Category>) categoryRepository.findAll();
        return listCategories;
    }
    @Override
    public Category findCategoryById(Integer id) {
        category = categoryRepository.findById(id).get();
        return category;
    }
}
