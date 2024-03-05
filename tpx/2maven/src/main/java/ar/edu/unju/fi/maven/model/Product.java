package ar.edu.unju.fi.maven.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

//como modifico un setter con lombok?
//para unir dos componentes podemos usar el DTO como buena practica
@Component
public class Product {
    private Integer id;

    @NotBlank
    private String name;

    @NotBlank
    private long code;
    private String image;

    @Autowired
    @NotEmpty
    //@NotNull
    private Category category;

    @Positive
    @NotEmpty
    private int price;

    @PositiveOrZero
    @NotEmpty
    @Max(value = 50)
    private float discount;
    private float salePrice;
    
    public Product(String name, long code, String image, int price, float discount) {
        this.name = name;
        this.code = code;
        this.image = image;
        this.price = price;
        this.discount = discount;
    }
    public Product() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getCode() {
        return code;
    }
    public void setCode(long code) {
        this.code = code;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public float getDiscount() {
        return discount;
    }
    public void setDiscount(float discount, int price) {
        if (discount>=1 & discount<=50) {
            this.discount = (price*discount)/100;
        } else {
            this.discount = 0;
        }
    }
    public float getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(float discount, int price) {
        this.salePrice = price-discount;
    }
}