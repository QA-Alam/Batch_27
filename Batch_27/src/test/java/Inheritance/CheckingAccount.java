package Inheritance;
public class CheckingAccount {
//we are not initialize any value at the class level 
//and instance level variable because of we need to reuse those variable

// declaring all the variable
	static int balance;
	static int withdraw;
	static int deposit;
	static String accountName = "Turikul Islam";
	static int total;
	String name;

	protected void accountActivity() {
		balance = 1500;
		withdraw = 100;
		deposit = 9999;
		total = balance - withdraw + deposit;
		System.out.println(accountName + " total checking account balance $" + total);
	}

	public void getName() {
		name = "Abul Hashem";
		System.out.println(name);
	}
}