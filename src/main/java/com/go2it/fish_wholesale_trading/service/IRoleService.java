package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Role;

public interface IRoleService {
    public void save(Role role);
    public boolean update(Role role);
    public boolean remove(Role role);
}
