package com.smart.app.service;

import com.smart.app.entity.User;

public interface UserService {
    String login();

    boolean register(User user);
}
