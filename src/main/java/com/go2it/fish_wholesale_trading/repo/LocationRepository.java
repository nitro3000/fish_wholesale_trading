package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Location;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class LocationRepository implements ILocationRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Location location) {em.persist (location);
    }

    @Override
    public boolean update(Location location) {
        if (location != null) {
            em.persist (location);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update location, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(Location location) {
        if (location != null) {
            em.remove (location);
            System.out.println (" location was removed");
            return true;
        } else {
            System.out.println ("Unable to remove location, not exist.");
        }
        return false;
    }

}
