package com.cts.product.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Login;
import com.cts.product.entity.User;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public List<User> listUsers() {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
	}

	@Override
	public boolean validateUser(Login login) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Session ses = sessionFactory.getCurrentSession();
		Query qry = ses.createQuery("from Login where userName=:userName AND password=:pwd");
		qry.setParameter("userName", login.getUserName());
		qry.setParameter("pwd", login.getPassword());

		List<Login> users = qry.getResultList();
		//System.out.println("Dao: " + users + " size: " + users.size());

		if (users.size() != 0) {
			flag = true;
		}

		return flag;
	}

}
