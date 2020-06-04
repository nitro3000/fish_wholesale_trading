package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.OrderDetail;

public interface IOrderDetailRepository {
    public void save(OrderDetail orderDetail);
    public boolean update(OrderDetail orderDetail);
    public boolean remove(OrderDetail orderDetail);
}
