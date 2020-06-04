package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.DeliveryMethod;
import com.go2it.fish_wholesale_trading.repo.DeliveryMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliveryMethodService implements IDeliveryMethodService {
    @Autowired
    private DeliveryMethodRepository deliveryMethodRepository;

    @Transactional
    @Override
    public void save(DeliveryMethod deliveryMethod) {deliveryMethodRepository.save (deliveryMethod);
    }
    @Transactional
    @Override
    public boolean update(DeliveryMethod deliveryMethod) {
        return deliveryMethodRepository.update (deliveryMethod);
    }
    @Transactional
    @Override
    public boolean remove(DeliveryMethod deliveryMethod) {
        return deliveryMethodRepository.remove (deliveryMethod);
    }
}
