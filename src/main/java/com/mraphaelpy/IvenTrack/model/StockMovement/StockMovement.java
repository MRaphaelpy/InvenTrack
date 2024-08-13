package com.mraphaelpy.IvenTrack.model.StockMovement;

import java.util.Date;
import java.util.UUID;

public class StockMovement  {
  private StockMovementModel stockMovimenteModel;

    public StockMovement(StockMovementModel stockMovimenteModel) {
        this.stockMovimenteModel = stockMovimenteModel;
    }

    public UUID getId() {
        return stockMovimenteModel.getId();
    }

    public void setId(UUID id) {
        stockMovimenteModel.setId(id);
    }

    public int getProductId() {
        return stockMovimenteModel.getProductId();
    }

    public void setProductId(int productId) {
        stockMovimenteModel.setProductId(productId);
    }

    public int getQuantity() {
        return stockMovimenteModel.getQuantity();
    }

    public void setQuantity(int quantity) {
        stockMovimenteModel.setQuantity(quantity);
    }

    public String getType() {
        return stockMovimenteModel.getType();
    }

    public void setType(String type) {
        stockMovimenteModel.setType(type);
    }

    public Date getTimestamp() {
        return stockMovimenteModel.getTimestamp();
    }

    public void setTimestamp(Date timestamp) {
        stockMovimenteModel.setTimestamp(timestamp);
    }

    public StockMovementModel getStockMovimenteModel() {
        return stockMovimenteModel;
    }

    public void setStockMovimenteModel(StockMovementModel stockMovimenteModel) {
        this.stockMovimenteModel = stockMovimenteModel;
    }

}
