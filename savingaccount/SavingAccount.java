package com.savingaccount;

public class SavingAccount {
	private int acc_balance;
	private int acc_ID;
	String accountHoldername;
	boolean isSalaryAccount;
	int amount;
	public SavingAccount(int acc_balance,int acc_ID,String accountHoldername,boolean isSalaryAccount) {
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
		
	}
	public int getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	public void withdraw(int amount) {
		if(isSalaryAccount == true) {
			if(amount<acc_balance) {
		     this.acc_balance-=amount;
			}
			//else {
			//	System.out.println("You cannot withdraw that amount");
			//}
		}
	}
	public void deposit(int amount) {
		acc_balance=acc_balance+amount;
	}
	@Override
	public String toString()  
	 { 
	 return "SavingAccount [AccountBalance= "+getAcc_balance()+", Acc_ID= "+getAcc_ID()+", Account Holdername= "+getAccountHoldername()+"]"; 
	 } 
	  
}
