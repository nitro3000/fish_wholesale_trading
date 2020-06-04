package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.WorldRegion;

public interface IWorldRegionService {
    public void save(WorldRegion worldRegion);
    public boolean update(WorldRegion worldRegion);
    public boolean remove(WorldRegion worldRegion);
    public WorldRegion findById(int worldRegionId);

}
