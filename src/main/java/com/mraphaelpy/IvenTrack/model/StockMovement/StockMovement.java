package com.mraphaelpy.IvenTrack.model.StockMovement;

import java.util.Date;

public class StockMovement implements IStockMovement{
    private int id;
    private int productId;
    private int quantity;
    private String type; // in or out
    private Date timestamp;

    StockMovement(StockMovementModel stockMovementModel) {
        this.id = stockMovementModel.getId();
        this.productId = stockMovementModel.getProductId();
        this.quantity = stockMovementModel.getQuantity();
        this.type = stockMovementModel.getType();
        this.timestamp = stockMovementModel.getTimestamp();
    }

    @Override
    public void recordEntry(StockMovement stockMovement) {
        stockMovement.type = "in";
    }

    @Override
    public void recordExit(StockMovement stockMovement) {
        stockMovement.type = "out";
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
