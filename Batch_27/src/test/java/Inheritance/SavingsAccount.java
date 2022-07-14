package Inheritance;
public class SavingsAccount extends CheckingAccount {

public static void main(String[] args) {
	
	// if i create an object with parent class then we are getting the only parent class properties 
	CheckingAccount obj1 = new CheckingAccount(); 
	obj1.accountActivity();

	 // Create a object child class than we are getting both class properties 
	SavingsAccount obj = new SavingsAccount();
	obj.accountActivity();
	obj.savingActivity();
}
	protected  void savingActivity() {
		//System.out.println(CheckingAccount.accountName);
		CheckingAccount.balance = 10000;
		CheckingAccount.withdraw = 1000;
		CheckingAccount.deposit = 5000;
		CheckingAccount.total = CheckingAccount.balance -CheckingAccount.withdraw +CheckingAccount.deposit;
		System.out.println(CheckingAccount.accountName+ " total saving account balance$ "+ CheckingAccount.total);
	}
	
	// https://github.com/QA-Alam/DST-Automation.git
}