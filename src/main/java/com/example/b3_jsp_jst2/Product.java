package com.example.b3_jsp_jst2;

public class Product {
    private String product;
    private int price;
    private String img;

    public Product(String product, int price, String img) {
        this.product = product;
        this.price = price;
        this.img = img;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
