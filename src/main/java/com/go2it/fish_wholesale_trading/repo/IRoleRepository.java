package com.go2it.fish_wholesale_trading.repo;


import com.go2it.fish_wholesale_trading.entity.Role;

public interface IRoleRepository {
    public void save(Role role);
    public boolean update(Role role);
    public boolean remove(Role role);
}
