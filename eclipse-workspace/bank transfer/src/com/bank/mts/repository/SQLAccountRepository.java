package com.bank.mts.repository;

import com.bank.mts.model.Account;
import com.bank.mts.model.AccountType;

public class SQLAccountRepository {

	public Account loadAccount(String number) {
		Account account = new Account();
		account.setNubmer(number);
        account.setBalance(1000.00);
        account.setAccountType(AccountType.SAVINGS);
		
        return account;
        
	}
	
	public boolean updateAccount(Account account) {
		return true;
		
	}
}
