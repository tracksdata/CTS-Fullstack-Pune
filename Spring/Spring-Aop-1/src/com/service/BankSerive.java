package com.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.BankDAO;
import com.bank.model.Account;
import com.myanotations.Loggable;
@Service("bankService")
public class BankSerive {

	// State
	@Autowired
	private BankDAO bankDAO; // Dependency..

	// Behavior
	public void transfer(Account account) throws Exception {
		// Joinpoint
		System.out.println("----------");
		
		Account acc=bankDAO.findByID(account);
		if(acc==null) {
		throw new Exception();
		}
		System.out.println("-----------");
		
		System.out.println("transfer"); // B.L
	}

	public void deposit(Account account) {
		System.out.println("deposit"); // B.L

	}

	public double withdraw(Account account) {
		System.out.println("withdraw-1"); // B.L
		return 100.00;
	}

	@Loggable
	public double withdraw2(Account account, String param) {
		System.out.println("withdraw-2"); // B.L
		if (param.equals("val"))
			throw new RuntimeException();
		return 100.00;
	}

}
