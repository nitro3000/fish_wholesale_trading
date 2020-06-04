package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Location;

public interface ILocationService {
    public void save(Location location);
    public boolean update(Location location);
    public boolean remove(Location location);
}
