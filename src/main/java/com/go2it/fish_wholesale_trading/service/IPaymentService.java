package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Payment;

public interface IPaymentService {
    public void save(Payment payment);
    public boolean update(Payment payment);
    public boolean remove(Payment payment);
}
