package com.mraphaelpy.IvenTrack.Controllers.StockMovement;

import com.mraphaelpy.IvenTrack.Repository.StockMovementRepository.StockMovementRepository;
import com.mraphaelpy.IvenTrack.model.StockMovement.IStockMovement;
import com.mraphaelpy.IvenTrack.model.StockMovement.StockMovement;
import com.mraphaelpy.IvenTrack.model.StockMovement.StockMovementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StockMovementController implements IStockMovement {

    private final StockMovementRepository stockMovementRepository;

    @Autowired
    public StockMovementController(StockMovementRepository stockMovementRepository) {
        this.stockMovementRepository = stockMovementRepository;
    }

    @Override
    public void recordEntry(StockMovement stockMovement) {
        StockMovementModel stockMovementModel = stockMovement.getStockMovimenteModel();
        stockMovementModel.setType("ENTRY");
        stockMovementRepository.save(stockMovementModel);
    }

    @Override
    public void recordExit(StockMovement stockMovement) {
        StockMovementModel stockMovementModel = stockMovement.getStockMovimenteModel();
        stockMovementModel.setType("EXIT");
        stockMovementRepository.save(stockMovementModel);
    }
}