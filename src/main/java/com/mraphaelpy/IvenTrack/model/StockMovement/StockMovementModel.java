package com.mraphaelpy.IvenTrack.model.StockMovement;

import java.util.Date;

public class StockMovementModel {
    private int id;
    private int productId;
    private int quantity;
    private String type; // in or out
    private Date timestamp;

    public StockMovementModel(int id, int productId, int quantity, String type, Date timestamp) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.type = type;
        this.timestamp = timestamp;
    }

    public StockMovementModel(int productId, int quantity, String type, Date timestamp) {
        this.productId = productId;
        this.quantity = quantity;
        this.type = type;
        this.timestamp = timestamp;
    }
    void setId(int id) {
        this.id = id;
    }
    void setProductId(int productId) {
        this.productId = productId;
    }
    void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    void setType(String type) {
        this.type = type;
    }
    void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    int getId() {
        return id;
    }
    int getProductId() {
        return productId;
    }
    int getQuantity() {
        return quantity;
    }
    String getType() {
        return type;
    }
    Date getTimestamp() {
        return timestamp;
    }



}
