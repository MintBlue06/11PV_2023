package ar.edu.unju.fi.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.maven.model.Category;
import ar.edu.unju.fi.maven.service.impl.CategoryServiceImpl;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private Category category;

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    private static final String LIST_VIEW = "list-categories";
    private static final String FORM_VIEW = "new-category";

    @GetMapping("/list")
    public ModelAndView getListCategories() {
        ModelAndView mav = new ModelAndView(LIST_VIEW);
        mav.addObject("categories", categoryServiceImpl.getAllCategories());
        return mav;
    }
    //añadir buscar productos por categoria
    @GetMapping("/form")
    public ModelAndView getFormCategory() {
        ModelAndView mav = new ModelAndView(FORM_VIEW);
        mav.addObject("category", category);
        return mav;
    }
    @PostMapping("/add")
    public ModelAndView postAddCategory(@Valid @ModelAttribute("category") Category category,
     BindingResult result) {
        ModelAndView mav;
        if (result.hasErrors()) {
            mav = new ModelAndView(FORM_VIEW);
        } else {
            categoryServiceImpl.addCategory(category);
            mav = new ModelAndView(LIST_VIEW);
            mav.addObject("categories", categoryServiceImpl.getAllCategories());
        }
        return mav;
    }
    @PutMapping("/update/{id}")
    public ModelAndView getUpdateCategory(@PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView(FORM_VIEW);
        mav.addObject("category", categoryServiceImpl.findCategoryById(id));
        return mav;
    }
}
