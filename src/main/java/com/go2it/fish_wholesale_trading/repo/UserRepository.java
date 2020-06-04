package com.go2it.fish_wholesale_trading.repo;

import com.go2it.fish_wholesale_trading.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepository  implements IUserRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(User user) {em.persist (user);

    }

    @Override
    public boolean update(User user) {
        if (user != null) {
            em.persist (user);
            System.out.println (" Update was successful");
            return true;
        } else {
            System.out.println ("Unable to update user, not exist.");
        }
        return false;
    }

    @Override
    public boolean remove(User user) {
        if (user != null) {
            em.remove (user);
            System.out.println (" user was removed");
            return true;
        } else {
            System.out.println ("Unable to remove user, not exist.");
        }
        return false;
    }

    @Override
    public User findById(int userId) {
        User user=em.find (User.class, userId);
        return user;
    }
}
