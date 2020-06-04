package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.DeliveryMethod;

public interface IDeliveryMethodRepository {
    public void save(DeliveryMethod deliveryMethod);
    public boolean update(DeliveryMethod deliveryMethod);
    public boolean remove(DeliveryMethod deliveryMethod);
}
