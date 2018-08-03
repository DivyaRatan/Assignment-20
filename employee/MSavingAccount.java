package com.employee;
//Class SavingAccount with getter and setter
public class MSavingAccount {
	private int accountId;
	private String accountHolderName;
	private double accountBal;
	private boolean isSalaried;
	public MSavingAccount(int accountId, String accountHolderName, double accountBal, boolean isSalaried) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBal = accountBal;
		this.isSalaried = isSalaried;
	}
	public int getAccountId() {
		return accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getAccountBal() {
		return accountBal;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	@Override
	public String toString() {
		return "MMASavingsAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName
				+ ", accountBal=" + accountBal + ", isSalaried=" + isSalaried + "]";
	}
}
