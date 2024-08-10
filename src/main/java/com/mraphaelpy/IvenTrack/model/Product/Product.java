package com.mraphaelpy.IvenTrack.model.Product;

public class Product implements IProduct{
    private int id;
    private String name;
    private String description;
    private double price;
    private String sku;
    private String category;
    private int quantity;

    public Product(ProductModel productModel) {
        this.id = productModel.getId();
        this.name = productModel.getName();
        this.description = productModel.getDescription();
        this.price = productModel.getPrice();
        this.sku = productModel.getSku();
        this.category = productModel.getCategory();
        this.quantity = productModel.getQuantity();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductModel toProductModel() {
        ProductModel productModel = new ProductModel();
        productModel.setId(this.id);
        productModel.setName(this.name);
        productModel.setDescription(this.description);
        productModel.setPrice(this.price);
        productModel.setSku(this.sku);
        productModel.setCategory(this.category);
        productModel.setQuantity(this.quantity);
        return productModel;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", sku='" + sku + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public void createProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public Product getProductById(int id) {

        return null;
    }

}
