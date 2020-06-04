package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Product;
import com.go2it.fish_wholesale_trading.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ProductRepository implements IProductRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Product product) {
        em.persist (product);
    }

    @Override
    public boolean update(Product product) {
        if (product != null) {
            em.persist (product);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update product, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(Product product) {
        if (product != null) {
            em.remove (product);
            System.out.println (" product was removed");
            return true;
        } else {
            System.out.println ("Unable to remove product, not exist.");
        }
        return false;
    }
}
