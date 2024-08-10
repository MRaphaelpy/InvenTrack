package com.mraphaelpy.IvenTrack.model.StockMovement;

public interface IStockMovement {
    void recordEntry(StockMovement stockMovement);
    void recordExit(StockMovement stockMovement);
}
