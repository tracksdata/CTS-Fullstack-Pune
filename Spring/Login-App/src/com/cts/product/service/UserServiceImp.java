package com.cts.product.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.UserDao;
import com.cts.product.entity.Login;
import com.cts.product.entity.User;

/**
 * @author Praveen Somireddy
 *
 */

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Transactional(readOnly = true)
	@Override
	public List<User> listUsers() {
		return userDao.listUsers();
	}

	@Transactional
	@Override
	public boolean validateUser(Login login) {
		// TODO Auto-generated method stub
		return userDao.validateUser(login);
	}

}
