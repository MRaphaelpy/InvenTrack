package com.mraphaelpy.IvenTrack.Repository.StockMovementRepository;

import com.mraphaelpy.IvenTrack.model.StockMovement.StockMovementModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.UUID;

public interface StockMovementRepository extends JpaRepository<StockMovementModel, UUID> {
    @Query("SELECT sm FROM StockMovementModel sm WHERE sm.product.id = :productId")
    List<StockMovementModel> findByProductId(@Param("productId") UUID productId);

    @Query("SELECT sm FROM StockMovementModel sm WHERE sm.product.id = :productId AND sm.type = 'ENTRY'")
    List<StockMovementModel> findEntriesByProductId(@Param("productId") UUID productId);

    @Query("SELECT sm FROM StockMovementModel sm WHERE sm.product.id = :productId AND sm.type = 'EXIT'")
    List<StockMovementModel> findExitsByProductId(@Param("productId") UUID productId);

}
