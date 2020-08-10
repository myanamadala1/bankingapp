package com.bank.mts.model;

public class Account {

	private String nubmer;
	private double balance;
	private AccountType accountType;
	
	//Default constructor
	public Account() {
		
	}

	public String getNubmer() {
		return nubmer;
	}

	public void setNubmer(String nubmer) {
		this.nubmer = nubmer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	
}
