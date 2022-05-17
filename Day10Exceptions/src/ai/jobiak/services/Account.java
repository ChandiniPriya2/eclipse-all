package ai.jobiak.services;

import ai.jobiak.exceptions.TransferException;
import ai.jobiak.exceptions.WithdrawException;

public class Account implements AccountService {
	private String actNo;
	private String fullName;
	private double balance;
	public Account() {
		
	}
	public Account(String actNo, String fullName, double balance) {
	
		this.actNo = actNo;
		this.fullName = fullName;
		this.balance = balance;
	}
	public String getActNo() {
		return actNo;
	}
	public void setActNo(String actNo) {
		this.actNo = actNo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double withdraw(double amount) throws WithdrawException {
		if(this.balance-amount<0) {
			throw new WithdrawException("insufficient funds to carryout in"+this.actNo);
		}
		else {
		this.balance-=amount;
		}	return this.balance;
	}
	public double deposit(double amount) {
		this.balance+=amount;
		return this.balance;
	}
	public boolean transfer(Account account,double amount) throws TransferException {
		if(account.getBalance()>=amount) {
			this.balance-=amount;
		     account.setBalance(account.getBalance()+amount);
		
		}
		else {
			throw new TransferException("Insufficient funds in "+ account.getActNo());
		}
		return true;
	}
	public double getBalance(String accNo) {
		return 0;
	}

}
