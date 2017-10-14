package com;

import javax.persistence.Embeddable;

@Embeddable
public class Account {

	private String accountNo;
	private String accountName;
	private double balancfe;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalancfe() {
		return balancfe;
	}

	public void setBalancfe(double balancfe) {
		this.balancfe = balancfe;
	}

}
