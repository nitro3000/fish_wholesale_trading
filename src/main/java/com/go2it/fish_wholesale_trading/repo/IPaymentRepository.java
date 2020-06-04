package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Payment;

public interface IPaymentRepository {
    public void save(Payment payment);
    public boolean update(Payment payment);
    public boolean remove(Payment payment);
}
