package net.sduhsd.royr6099.scratch;

public class workystuff {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount(1000, 10);
		
		account.addInterest();
		System.out.println("The new account balance is $" + account.getBalance());
	}

}
