package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Payment;
import com.go2it.fish_wholesale_trading.repo.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentService implements IPaymentService{
    @Autowired
    private PaymentRepository paymentRepository;
    @Transactional
    @Override
    public void save(Payment payment) {paymentRepository.save (payment);
    }
    @Transactional
    @Override
    public boolean update(Payment payment) {
        return paymentRepository.update (payment);
    }
    @Transactional
    @Override
    public boolean remove(Payment payment) {
        return paymentRepository.remove (payment);
    }
}
