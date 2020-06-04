package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Order;
import com.go2it.fish_wholesale_trading.entity.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class OrderRepository implements IOrderRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Order order) {
        em.persist (order);
    }

    @Override
    public boolean update(Order order) {
        if (order != null) {
            em.persist (order);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update user, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(Order order) {
        if (order != null) {
            em.remove (order);
            System.out.println (" order was removed");
            return true;
        } else {
            System.out.println ("Unable to remove order, not exist.");
        }
        return false;
    }
}
