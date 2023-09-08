package com.ofss.model;

public abstract class Account {
	private int accountNo;
	private double accountBalance;
	private String ifscCode;
	private String bankName;
	private String accountType;
	private double minimumBalance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNo, double accountBalance, String ifscCode, String bankName, String accountType,
			double minimumBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.accountType = accountType;
		this.minimumBalance = minimumBalance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountBalance=" + accountBalance + ", ifscCode=" + ifscCode
				+ ", bankName=" + bankName + ", accountType=" + accountType + ", minimumBalance=" + minimumBalance
				+ "]";
	}
	
	

}
