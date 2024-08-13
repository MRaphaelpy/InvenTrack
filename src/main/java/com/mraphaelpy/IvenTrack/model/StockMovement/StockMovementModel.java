package com.mraphaelpy.IvenTrack.model.StockMovement;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "stock_movement")
public class StockMovementModel implements Serializable {
    private UUID id;
    private int productId;
    private int quantity;
    private String type; // in or out
    private Date timestamp;

    public StockMovementModel(UUID id, int productId, int quantity, String type, Date timestamp) {
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
