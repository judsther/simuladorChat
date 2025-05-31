package com.kodigo.chat.service;

import com.kodigo.chat.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private final Map<String, User> users = new HashMap<>();

    public User createUser(String id, String name) {
        User user = new User(id, name);
        users.put(id, user);
        return user;
    }

    public User getUser(String id) {
        return users.get(id);
    }
}
