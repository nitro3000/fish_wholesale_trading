package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Shipment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ShipmentRepository implements IShipmentRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Shipment shipment) {em.persist (shipment);

    }

    @Override
    public boolean update(Shipment shipment) {
        if (shipment != null) {
            em.persist (shipment);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update shipment, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(Shipment shipment) {
        if (shipment != null) {
            em.remove (shipment);
            System.out.println (" shipment was removed");
            return true;
        } else {
            System.out.println ("Unable to remove shipment, not exist.");
        }
        return false;
    }
}
