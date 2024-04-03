package org.liz.test.services;

import org.liz.test.models.User;

public interface UserService {
    User getUser(Integer id);

    void remove(Integer id);
}
