package com.bank.mts.service;

import com.bank.mts.model.Account;
import com.bank.mts.repository.SQLAccountRepository;

public class NEFTTransferService {
	
	public NEFTTransferService() {
		System.out.println("NEFTTransferService instance created..");
	}

	public boolean transfer(double amount, String fromAccNum, String toAccNum) {
		
		System.out.println("txr initiated..");
		
		SQLAccountRepository sqlAccountRepository = new SQLAccountRepository();
		Account fromAccount = sqlAccountRepository.loadAccount(fromAccNum);
		Account toAccount = sqlAccountRepository.loadAccount(toAccNum);
		
		System.out.println("debit & credit..");
		fromAccount.setBalance(fromAccount.getBalance()- amount);
		toAccount.setBalance(toAccount.getBalance()+amount);
		
		sqlAccountRepository.updateAccount(fromAccount);
		sqlAccountRepository.updateAccount(toAccount);
		
		System.out.println("txr completed..");

		return true;
		
	}
}
