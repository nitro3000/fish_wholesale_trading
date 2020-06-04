package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Product;

public interface IProductRepository {
    public void save(Product product);

    public boolean update(Product product);

    public boolean remove(Product product);
}
