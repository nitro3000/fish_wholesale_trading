package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.WorldRegion;

public interface IWorldRegionRepository {

    public void save(WorldRegion worldRegion);
    public boolean update(WorldRegion worldRegion);
    public boolean remove(WorldRegion worldRegion);
    public WorldRegion findById(int worldRegionId);
}
