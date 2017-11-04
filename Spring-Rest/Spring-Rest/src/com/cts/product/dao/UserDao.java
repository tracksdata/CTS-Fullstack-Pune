package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Login;
import com.cts.product.entity.User;

public interface UserDao {
	void add(User user);

	List<User> listUsers();
	
	boolean validateUser(Login login);
}
