package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.WorldRegion;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class WorldRegionRepository implements IWorldRegionRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(WorldRegion worldRegion) {
        em.persist (worldRegion);
    }

    @Override
    public boolean update(WorldRegion worldRegion) {
        if (worldRegion != null) {
            em.persist (worldRegion);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update world_region, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(WorldRegion worldRegion) {
        if (worldRegion != null) {
            em.remove (worldRegion);
            System.out.println (" World_region was removed");
            return true;
        }
        return false;
    }

    @Override
    public WorldRegion findById(int worldRegionId) {
        WorldRegion worldRegion = em.find (WorldRegion.class, worldRegionId);
        return worldRegion;

    }
}
