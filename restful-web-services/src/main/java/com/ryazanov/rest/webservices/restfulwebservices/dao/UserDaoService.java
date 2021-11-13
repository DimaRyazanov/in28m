package com.ryazanov.rest.webservices.restfulwebservices.dao;

import com.ryazanov.rest.webservices.restfulwebservices.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static final List<User> users = new ArrayList<>();
    private static int usersId = 3;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersId);
        }

        users.add(user);

        return user;
    }

    public User find(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }
}
