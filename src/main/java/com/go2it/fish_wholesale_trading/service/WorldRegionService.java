package com.go2it.fish_wholesale_trading.service;


import com.go2it.fish_wholesale_trading.entity.WorldRegion;
import com.go2it.fish_wholesale_trading.repo.WorldRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WorldRegionService implements IWorldRegionService {

    @Autowired
    private WorldRegionRepository worldRegionRepository;


    @Transactional
    @Override
    public void save(WorldRegion worldRegion) {
        worldRegionRepository.save (worldRegion);
    }

    @Transactional
    @Override
    public boolean update(WorldRegion worldRegion) {
        return worldRegionRepository.update (worldRegion);
    }

    @Transactional
    @Override
    public boolean remove(WorldRegion worldRegion) {
        return worldRegionRepository.remove (worldRegion);
    }

    @Override
    public WorldRegion findById(int worldRegionId) {
        return worldRegionRepository.findById (worldRegionId);
    }
}
