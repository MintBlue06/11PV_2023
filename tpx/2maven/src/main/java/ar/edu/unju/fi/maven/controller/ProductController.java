package ar.edu.unju.fi.maven.controller;

import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.maven.model.Category;
import ar.edu.unju.fi.maven.model.Product;
import ar.edu.unju.fi.maven.service.impl.CategoryServiceImpl;
import ar.edu.unju.fi.maven.service.impl.ProductServiceImpl;
import ar.edu.unju.fi.maven.util.UploadImage;
import jakarta.validation.Valid;

/**
 * Controlador de productos
 * @author Matias Carlos Alvarez
 * @since 9/2/2024
 * son utiles los comentarios del autor y la fecha?
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private Product product;

    @Autowired
    private Category category;

    @Autowired
    private UploadImage uploadImage;

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    private static final String LIST_VIEW = "list-products";
    private static final String FORM_VIEW = "new-product";

    @GetMapping("/list")
    public ModelAndView getListProducts() {
        ModelAndView mav = new ModelAndView(LIST_VIEW);
        mav.addObject("products", productServiceImpl.getAllProducts());
        return mav;
    }
    /*
     * @GetMapping("/list/{category}")
    public ModelAndView getListProductsByCategory(@PathVariable("category") Category category) {
        ModelAndView mav = new ModelAndView(LIST_VIEW);
        mav.addObject("products", productServiceImpl.findProductsByCategory(category));
        return mav;
    }
     */
    @GetMapping("/form")
    public ModelAndView getFormProduct() {
        ModelAndView mav = new ModelAndView(FORM_VIEW);
        mav.addObject("product", new Product());
        mav.addObject("categories", categoryServiceImpl.getAllCategories());
        return mav;
    }
    @PostMapping("/add")
    public ModelAndView postAddProduct(@Valid @ModelAttribute("product") Product product,
     BindingResult result, @RequestParam("image") MultipartFile image) throws Exception {
        ModelAndView mav;
        if (result.hasErrors()) {
            mav = new ModelAndView(FORM_VIEW);
            mav.addObject("products", productServiceImpl.getAllProducts());
            return mav;
        }
        category = categoryServiceImpl.findCategoryById(product.getCategory().getId());
        product.setCategory(category);
        if (product.getId()>0) {
            product = productServiceImpl.findProductById(product.getId());
        }
        if (!image.isEmpty() && product.getImage().length()>0) {
            uploadImage.delete(product.getImage());
            String uniqueFilename = uploadImage.copy(image);
            product.setImage(uniqueFilename);
        } else {
            if (product.getImage() != null) {
                product.setImage(product.getImage());
            }
        }
        productServiceImpl.addProduct(product);
        mav = new ModelAndView(LIST_VIEW);
        mav.addObject("products", productServiceImpl.getAllProducts());
        return mav;
    }
    @PutMapping("/update/{id}")
    public ModelAndView putUpdateProduct(@PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView(FORM_VIEW);
        mav.addObject("product", productServiceImpl.findProductById(id));
        mav.addObject("categories", categoryServiceImpl.getAllCategories());
        return mav;
    }
    @DeleteMapping("/delete/{id}")
    public ModelAndView deleteProduct(@PathVariable("id") Integer id) {
        productServiceImpl.deleteProduct(id);
        ModelAndView mav = new ModelAndView(LIST_VIEW);
        mav.addObject("products", productServiceImpl.getAllProducts());
        return mav;
    }
    /*
     * @GetMapping("/datail/image/{id}")
    public ModelAndView getUpdateImage(@PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView(FORM_VIEW);
        mav.addObject("product", productServiceImpl.findProductById(id));
        mav.addObject("categories", categoryServiceImpl.getAllCategories());
        return mav;
    }
     */
    @GetMapping("/uploads/{filename}")
    public ResponseEntity<Resource> goImage(@PathVariable String filename) {
        Resource resource = null;
        try {
            resource = uploadImage.load(filename);
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        }
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
         "attachment; filename=/" + resource.getFilename() + "/").body(resource);
    }
}