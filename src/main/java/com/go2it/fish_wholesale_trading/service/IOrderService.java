package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Order;

public interface IOrderService {
    public void save(Order order);
    public boolean update(Order order);
    public boolean remove(Order order);
}
