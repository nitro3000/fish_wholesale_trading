package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Payment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PaymentRepository implements IPaymentRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Payment payment) {em.persist (payment);
    }

    @Override
    public boolean update(Payment payment) {
        if (payment != null) {
            em.persist (payment);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update payment, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(Payment payment) {
        if (payment != null) {
            em.remove (payment);
            System.out.println (" user was removed");
            return true;
        } else {
            System.out.println ("Unable to remove payment, not exist.");
        }
        return false;
    }
}
