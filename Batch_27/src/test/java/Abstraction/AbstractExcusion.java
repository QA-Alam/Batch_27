package Abstraction;

public class AbstractExcusion extends AbstractTest { //July 14, 2022
	
	/*
	 We are completing the abstract class here by using extends keyword
	 
	 
	 */

	//we are completing the abstract method in this class 
	@Override
	public void getEmploymentInformation() { 
		
		System.out.println("I was incomplete method in the other class!");
	}
	
	public static void main(String[] args) {
		
		/*we can't create a object with the abstract class 
		For example: 
		AbstractTest obj = new AbstractTest(); //Wrong approach 
		*/
		
		
		AbstractExcusion obj = new AbstractExcusion();
		
		obj.getEmploymentInformation();
		obj.getName();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
