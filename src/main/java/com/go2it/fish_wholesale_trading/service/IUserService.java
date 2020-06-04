package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.User;

public interface IUserService {
    public void save(User user);
    public boolean update(User user);
    public boolean remove(User user);
    public User findById(int userId);
}
