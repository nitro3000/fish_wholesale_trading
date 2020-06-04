package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Location;
import com.go2it.fish_wholesale_trading.repo.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LocationService implements ILocationService {
    @Autowired
    private LocationRepository locationRepository;

    @Transactional
    @Override
    public void save(Location location) {locationRepository.save (location);
    }
    @Transactional
    @Override
    public boolean update(Location location) {
        return locationRepository.update (location);
    }
    @Transactional
    @Override
    public boolean remove(Location location) {
        return locationRepository.remove (location);
    }
}
