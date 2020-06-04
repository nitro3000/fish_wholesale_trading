package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.DeliveryMethod;

public interface IDeliveryMethodService {
    public void save(DeliveryMethod deliveryMethod);
    public boolean update(DeliveryMethod deliveryMethod);
    public boolean remove(DeliveryMethod deliveryMethod);
}
