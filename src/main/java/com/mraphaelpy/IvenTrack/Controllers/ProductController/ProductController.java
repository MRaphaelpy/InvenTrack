package com.mraphaelpy.IvenTrack.Controllers.ProductController;

import com.mraphaelpy.IvenTrack.Interfaces.IProduct;
import com.mraphaelpy.IvenTrack.Models.Product.Product;
import com.mraphaelpy.IvenTrack.Models.Product.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
@Controller
public class ProductController implements IProduct {
    private Map<UUID, Product> productDatabase = new HashMap<>();

    @Autowired
    public ProductController() {
    }


    @Override
    public void createProduct(ProductModel productModel) {
        UUID id = UUID.randomUUID();
        productModel.setId(id);
        Product product = new Product(productModel);
        productDatabase.put(id, product);
    }

    @Override
    public void updateProduct(Product product) {
    UUID id = UUID.nameUUIDFromBytes(String.valueOf(product.getId()).getBytes());
    if(productDatabase.containsKey(id)){
        productDatabase.put(id, product);
    }else {
        throw new RuntimeException("Produto nao encontrado");
    }
    }

    @Override
    public void deleteProduct(Product product) {
    UUID id = UUID.nameUUIDFromBytes(String.valueOf(product.getId()).getBytes());
    if(productDatabase.containsKey(id)){
        productDatabase.remove(id);
    }else{
        throw new RuntimeException("Produto nao encontrado");
    }
    }

    @Override
    public Product getProductById(UUID id) {
        return  productDatabase.get(id);
    }
}
