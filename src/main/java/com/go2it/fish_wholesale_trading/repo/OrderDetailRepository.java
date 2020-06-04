package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.OrderDetail;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class OrderDetailRepository implements IOrderDetailRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(OrderDetail orderDetail) {em.persist (orderDetail);
    }

    @Override
    public boolean update(OrderDetail orderDetail) {
        if (orderDetail != null) {
            em.persist (orderDetail);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update orderDetail, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(OrderDetail orderDetail) {
        if (orderDetail!= null) {
            em.remove (orderDetail);
            System.out.println (" orderDetail was removed");
            return true;
        } else {
            System.out.println ("Unable to remove orderDetail, not exist.");
        }
        return false;
    }
}
