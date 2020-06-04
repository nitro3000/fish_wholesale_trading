package com.go2it.fish_wholesale_trading.service;

import com.go2it.fish_wholesale_trading.entity.User;
import com.go2it.fish_wholesale_trading.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void save(User user) {userRepository.save (user);
    }

    @Transactional
    @Override
    public boolean update(User user) {
        return userRepository.update (user);
    }
    @Transactional
    @Override
    public boolean remove(User user) {
        return userRepository.remove (user);
    }

    @Override
    public User findById(int userId) {
        return userRepository.findById (userId);
    }


}
