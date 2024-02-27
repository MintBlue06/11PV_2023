package ar.edu.unju.fi.maven.controller;
//En construccion!!!
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controlador de productos
 * @author Matias Carlos Alvarez
 * @since 9/2/2024
 * son utiles los comentarios del autor y la fecha?
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    /*@Autowired
    private Product product;*/

    /* Ejemplo
     * @GetMapping
        public ModelAndView getPageForm {}
     */

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
    return new String();
    }
    /* Ejemplo
     * @PostMapping("path")
        public ModelAndView postPageSave(@ModelAttribute ("product") Product product) {
        //TODO: process POST request
        
        return entity;
    }
     */
    
    @PostMapping("path")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
}