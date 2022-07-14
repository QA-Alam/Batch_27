package Inheritance;

public class CreditCard extends SavingsAccount{
	
	 public void getCredit() {
		 System.out.println("My total credit $ 1000");
	 }
	 
public static void main(String[] args) {
	CreditCard multilevelProperties = new CreditCard();
	multilevelProperties.accountActivity();
	multilevelProperties.savingActivity();
	multilevelProperties.getCredit();
}
}