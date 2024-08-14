package com.mraphaelpy.IvenTrack.Repository.StockMovementRepository;
import com.mraphaelpy.IvenTrack.Interfaces.IStockMovementRepository;
import com.mraphaelpy.IvenTrack.Models.StockMovement.StockMovementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.UUID;

@Repository
public class StockMovementRepository implements IStockMovementRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<StockMovementModel> findByProductId(UUID productId) {
        String jpql = "SELECT sm FROM StockMovementModel sm WHERE sm.product.id = :productId";
        TypedQuery<StockMovementModel> query = entityManager.createQuery(jpql, StockMovementModel.class);
        query.setParameter("productId", productId);
        return query.getResultList();
    }

    @Override
    public List<StockMovementModel> findEntriesByProductId(UUID productId) {
        String jpql = "SELECT sm FROM StockMovementModel sm WHERE sm.product.id = :productId AND sm.type = 'ENTRY'";
        TypedQuery<StockMovementModel> query = entityManager.createQuery(jpql, StockMovementModel.class);
        query.setParameter("productId", productId);
        return query.getResultList();
    }

    @Override
    public List<StockMovementModel> findExitsByProductId(UUID productId) {
        String jpql = "SELECT sm FROM StockMovementModel sm WHERE sm.product.id = :productId AND sm.type = 'EXIT'";
        TypedQuery<StockMovementModel> query = entityManager.createQuery(jpql, StockMovementModel.class);
        query.setParameter("productId", productId);
        return query.getResultList();
    }

    public void save(StockMovementModel stockMovementModel) {
        entityManager.persist(stockMovementModel);
    }
}
