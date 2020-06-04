package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.OrderDetail;

public interface IOrderDetailService {
    public void save(OrderDetail orderDetail);
    public boolean update(OrderDetail orderDetail);
    public boolean remove(OrderDetail orderDetail);
}
