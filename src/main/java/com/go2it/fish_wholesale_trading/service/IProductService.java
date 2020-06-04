package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Product;

public interface IProductService {
    public void save(Product product);

    public boolean update(Product product);

    public boolean remove(Product product);
}
