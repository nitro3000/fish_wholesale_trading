package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Shipment;
import com.go2it.fish_wholesale_trading.repo.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ShipmentService implements IShipmentService {
    @Autowired
    private ShipmentRepository shipmentRepository;
    @Transactional
    @Override
    public void save(Shipment shipment) {shipmentRepository.save (shipment);

    }
    @Transactional
    @Override
    public boolean update(Shipment shipment) {
        return shipmentRepository.update (shipment);
    }
    @Transactional
    @Override
    public boolean remove(Shipment shipment) {
        return shipmentRepository.remove (shipment);
    }
}
