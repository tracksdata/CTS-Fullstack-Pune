package com;

import org.springframework.stereotype.Component;

@Component("a1")
public class Address {

	private int addrId=10;
	private String address="HYD";

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
