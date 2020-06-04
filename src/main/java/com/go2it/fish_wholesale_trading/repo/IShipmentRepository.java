package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Shipment;
import com.go2it.fish_wholesale_trading.entity.User;

public interface IShipmentRepository {
    public void save(Shipment shipment);
    public boolean update(Shipment shipment);
    public boolean remove(Shipment shipment);
}
