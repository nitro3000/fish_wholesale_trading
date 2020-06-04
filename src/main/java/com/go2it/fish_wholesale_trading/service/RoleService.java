package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.Role;
import com.go2it.fish_wholesale_trading.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private RoleRepository roleRepository;

    public RoleService() {
    }

    @Transactional
    @Override
    public void save(Role role) {roleRepository.save (role);

    }
    @Transactional
    @Override
    public boolean update(Role role) {
        return roleRepository.update (role);
    }
    @Transactional
    @Override
    public boolean remove(Role role) {
        return roleRepository.remove (role);
    }
}
