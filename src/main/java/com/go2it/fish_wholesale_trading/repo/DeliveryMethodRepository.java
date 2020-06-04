package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.DeliveryMethod;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DeliveryMethodRepository implements IDeliveryMethodRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(DeliveryMethod deliveryMethod) {em.persist (deliveryMethod);
    }

    @Override
    public boolean update(DeliveryMethod deliveryMethod) {
        if (deliveryMethod != null) {
            em.persist (deliveryMethod);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update deliveryMethod, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(DeliveryMethod deliveryMethod) {
        if (deliveryMethod != null) {
            em.remove (deliveryMethod);
            System.out.println (" deliveryMethod was removed");
            return true;
        } else {
            System.out.println ("Unable to remove deliveryMethod, not exist.");
        }
        return false;
    }
}
