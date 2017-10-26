package com.bank.dao;

import org.springframework.stereotype.Repository;

import com.bank.model.Account;


@Repository("bankDao")
public class BankDAO {

	public void save(Account account) {
		System.out.println("Save");
	}

	public Account findByID(Account accountNo) {
		System.out.println("Find By ID");
		return null;

	}

}
