package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Warehouse;

public interface IWarehouseService {
    public void save(Warehouse warehouse);
    public boolean update(Warehouse warehouse);
    public boolean remove(Warehouse warehouse);

}
