package com.mraphaelpy.IvenTrack.Interfaces;

import com.mraphaelpy.IvenTrack.Models.StockMovement.StockMovementModel;

import java.util.List;
import java.util.UUID;

public interface IStockMovementRepository {
    List<StockMovementModel> findByProductId(UUID productId);

    List<StockMovementModel> findEntriesByProductId(UUID productId);

    List<StockMovementModel> findExitsByProductId(UUID productId);
}
