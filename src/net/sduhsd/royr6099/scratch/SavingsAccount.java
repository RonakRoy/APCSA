package net.sduhsd.royr6099.scratch;

public class SavingsAccount {
	private double balance, interest;
	
	public SavingsAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void addInterest() {
		balance *= 1.0 + interest / 100.0;
	}
}
