package com.mraphaelpy.IvenTrack.Interfaces;

import com.mraphaelpy.IvenTrack.Models.Product.Product;
import com.mraphaelpy.IvenTrack.Models.Product.ProductModel;

import java.util.UUID;

public interface IProduct {
    void createProduct(ProductModel product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
    Product getProductById(UUID id);
}
