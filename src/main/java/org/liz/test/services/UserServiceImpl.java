package org.liz.test.services;

import org.liz.test.models.User;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{
    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }
}
