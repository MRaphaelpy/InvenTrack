package com.mraphaelpy.IvenTrack.model.Product;

import java.util.UUID;

public interface IProduct {
    void createProduct(ProductModel product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
    Product getProductById(UUID id);
}
