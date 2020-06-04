package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.OrderDetail;
import com.go2it.fish_wholesale_trading.repo.OrderDetailRepository;
import com.go2it.fish_wholesale_trading.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService  implements  IOrderDetailService{
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public void save(OrderDetail orderDetail) {orderDetailRepository.save (orderDetail);
    }

    @Override
    public boolean update(OrderDetail orderDetail) {
        return orderDetailRepository.update (orderDetail);
    }

    @Override
    public boolean remove(OrderDetail orderDetail) {
        return orderDetailRepository.remove (orderDetail);
    }
}
