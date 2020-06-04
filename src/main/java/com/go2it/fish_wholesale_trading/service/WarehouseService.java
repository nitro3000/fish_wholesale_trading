package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Warehouse;
import com.go2it.fish_wholesale_trading.repo.IWarehouseRepository;
import com.go2it.fish_wholesale_trading.repo.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WarehouseService implements IWarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;

    @Transactional
    @Override
    public void save(Warehouse warehouse) {warehouseRepository.save (warehouse);
    }

    @Transactional
    @Override
    public boolean update(Warehouse warehouse) {
        return warehouseRepository.update (warehouse);
    }

    @Transactional
    @Override
    public boolean remove(Warehouse warehouse) {
        return warehouseRepository.remove (warehouse);
    }
}
