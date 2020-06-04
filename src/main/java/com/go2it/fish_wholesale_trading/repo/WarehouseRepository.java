package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Warehouse;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class WarehouseRepository implements IWarehouseRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Warehouse warehouse) {em.persist (warehouse);
    }

    @Override
    public boolean update(Warehouse warehouse) {
        if (warehouse != null) {
            em.persist (warehouse);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update warehouse, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(Warehouse warehouse) {
        if (warehouse != null) {
            em.remove (warehouse);
            System.out.println (" warehouse was removed");
            return true;
        } else {
            System.out.println ("Unable to remove warehouse, not exist.");
        }
        return false;
    }
}
