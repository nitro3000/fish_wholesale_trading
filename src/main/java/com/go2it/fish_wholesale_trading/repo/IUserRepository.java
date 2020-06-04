package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.Country;
import com.go2it.fish_wholesale_trading.entity.User;

public interface IUserRepository {
    public void save(User user);
    public boolean update(User user);
    public boolean remove(User user);
    public User findById(int userId);

}
