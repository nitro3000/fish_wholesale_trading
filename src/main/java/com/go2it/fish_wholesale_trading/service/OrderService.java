package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Order;
import com.go2it.fish_wholesale_trading.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    @Override
    public void save(Order order) {
        orderRepository.save (order);
    }

    @Transactional
    @Override
    public boolean update(Order order) {
        return orderRepository.update (order);
    }

    @Transactional
    @Override
    public boolean remove(Order order) {
        return orderRepository.remove (order);
    }
}
