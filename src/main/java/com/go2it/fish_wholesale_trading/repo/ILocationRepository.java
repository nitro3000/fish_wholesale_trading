package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Location;

public interface ILocationRepository {
    public void save(Location location);
    public boolean update(Location location);
    public boolean remove(Location location);
}
