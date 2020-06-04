package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Order;
import com.go2it.fish_wholesale_trading.entity.User;

public interface IOrderRepository {
    public void save(Order order);
    public boolean update(Order order);
    public boolean remove(Order order);
}
