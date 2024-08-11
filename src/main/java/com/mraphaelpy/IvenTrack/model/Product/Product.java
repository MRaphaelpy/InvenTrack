package com.mraphaelpy.IvenTrack.model.Product;

import java.util.UUID;

public class Product{
    private ProductModel productModel;

    public Product(ProductModel productModel) {
        this.productModel = productModel;
    }


    public UUID getId() {
        return productModel.getId();
    }

    public void setId(UUID id) {
        productModel.setId(id);
    }

    public String getName() {
        return productModel.getName();
    }

    public void setName(String name) {
        productModel.setName(name);
    }

    public String getDescription() {
        return productModel.getDescription();
    }

    public void setDescription(String description) {
        productModel.setDescription(description);
    }

    public double getPrice() {
        return productModel.getPrice();
    }

    public void setPrice(double price) {
        productModel.setPrice(price);
    }

    public String getSku() {
        return productModel.getSku();
    }

    public void setSku(String sku) {
        productModel.setSku(sku);
    }

    public String getCategory() {
        return productModel.getCategory();
    }

    public void setCategory(String category) {
        productModel.setCategory(category);
    }

    public int getQuantity() {
        return productModel.getQuantity();
    }

    public void setQuantity(int quantity) {
        productModel.setQuantity(quantity);
    }

    public ProductModel getProductModel() {
        return productModel;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + productModel.getId() +
                ", name='" + productModel.getName() + '\'' +
                ", description='" + productModel.getDescription() + '\'' +
                ", price=" + productModel.getPrice() +
                ", sku='" + productModel.getSku() + '\'' +
                ", category='" + productModel.getCategory() + '\'' +
                ", quantity=" + productModel.getQuantity() +
                '}';
    }
}