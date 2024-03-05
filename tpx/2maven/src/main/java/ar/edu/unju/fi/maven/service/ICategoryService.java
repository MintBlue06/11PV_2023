package ar.edu.unju.fi.maven.service;

import java.util.List;

import ar.edu.unju.fi.maven.model.Category;

public interface ICategoryService {
    public void addCategory(Category category);

    public List<Category> getAllCategories();

    public Category findCategoryById(Integer id);
}
