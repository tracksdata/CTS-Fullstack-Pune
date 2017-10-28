package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Login;
import com.cts.product.entity.User;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    boolean validateUser(Login login);
}
