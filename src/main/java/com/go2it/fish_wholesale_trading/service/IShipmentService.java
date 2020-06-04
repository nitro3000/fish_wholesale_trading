package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Shipment;

public interface IShipmentService {
    public void save(Shipment shipment);
    public boolean update(Shipment shipment);
    public boolean remove(Shipment shipment);
}
