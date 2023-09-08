package com.ofss.model;
/*
 * Class contains the customer & account details
 */
public class AccountDetails {
	Account ac;
	Customer c;
	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountDetails(Account ac, Customer c) {
		super();
		this.ac = ac;
		this.c = c;
	}
	public Account getAc() {
		return ac;
	}
	public void setAc(Account ac) {
		this.ac = ac;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	public String toString() {
		return "AccountDetails [ac=" + ac + ", c=" + c + "]";
	}
	
	

}
