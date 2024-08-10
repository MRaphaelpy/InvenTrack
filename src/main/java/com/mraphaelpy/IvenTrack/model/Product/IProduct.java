package com.mraphaelpy.IvenTrack.model.Product;

public interface IProduct {
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
    Product getProductById(int id);
}
