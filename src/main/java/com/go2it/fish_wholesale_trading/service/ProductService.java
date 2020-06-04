package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Product;
import com.go2it.fish_wholesale_trading.repo.IProductRepository;
import com.go2it.fish_wholesale_trading.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Transactional
    @Override
    public void save(Product product) {
        productRepository.save (product);
    }

    @Transactional
    @Override
    public boolean update(Product product) {
        return productRepository.update (product);
    }

    @Transactional
    @Override
    public boolean remove(Product product) {
        return productRepository.remove (product);
    }
}
