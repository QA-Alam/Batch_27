package polymorphism;

public class OverridingClassB extends OverridingClassA{

	 public static void main(String[] args) {
		 
		 OverridingClassA.getAnything(); // output: Anything
		 
		 OverridingClassB.getAnything();// output: Something
	
		 OverridingClassB obj = new OverridingClassB();//Child class object
		   obj.getProperty();
		   obj.getCash();
		   obj.getCar();
		   
	}
		
	
	 public static void getWife(String name) {   //This method is override in the child class by change the functionality 
			System.out.println("My wife name is " + name);
		   
		}
	
	
	 public void getCar() {
		     System.out.println("I have a BMW");
	   }
	 
	 public static void getAnything() {
		 System.out.println("something");
	 }
	
	
	
	
	
}
