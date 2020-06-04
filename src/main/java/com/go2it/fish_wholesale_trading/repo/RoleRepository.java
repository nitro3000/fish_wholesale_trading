package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RoleRepository implements IRoleRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Role role) {em.persist (role);

    }

    @Override
    public boolean update(Role role) {
        if (role != null) {
            em.persist (role);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update Role, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(Role role) {
        if (role != null) {
            em.remove (role);
            System.out.println (" Remove was successful");
            return true;
        } else {
            System.out.println ("Unable to remove Role, not exist.");
        }
        return false;
    }
}
