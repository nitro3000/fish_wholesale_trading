package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.User;
import com.go2it.fish_wholesale_trading.entity.Warehouse;

public interface IWarehouseRepository {
    public void save(Warehouse warehouse);
    public boolean update(Warehouse warehouse);
    public boolean remove(Warehouse warehouse);

}
