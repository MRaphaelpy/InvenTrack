package com.mraphaelpy.IvenTrack.Interfaces;

import com.mraphaelpy.IvenTrack.Models.StockMovement.StockMovement;

public interface IStockMovement {
    void recordEntry(StockMovement stockMovement);
    void recordExit(StockMovement stockMovement);
}
