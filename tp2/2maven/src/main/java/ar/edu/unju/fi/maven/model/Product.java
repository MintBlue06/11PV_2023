package ar.edu.unju.fi.maven.model;

import org.springframework.stereotype.Component;

//como modifico un setter con lombok?
@Component
public class Product {
    // id?
    private String name;
    private long code;
    private String image;
    private String category;
    private int price;
    private float discount;
    private float salePrice;
    
    public Product(String name, long code, String image, String category, int price, float discount, float salePrice) {
        this.name = name;
        this.code = code;
        this.image = image;
        this.category = category;
        this.price = price;
        this.discount = discount;
        this.salePrice = salePrice;
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
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
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