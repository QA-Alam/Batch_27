package polymorphism;

public class OverridingClassB extends OverridingClassA{

	 public static void main(String[] args) {
		 OverridingClassB obj = new OverridingClassB();//Child class object
		   obj.getProperty();
		   obj.getCash();
		   obj.getWife("Unknown");
		   obj.getCar();
		   
	}
		
	
	 public void getWife(String name) {   //This method is override in the child class by change the functionality 
			System.out.println("My wife name is " + name);
		   
		}
	
	
	 public void getCar() {
		     System.out.println("I have a BMW");
	   }
	
	
	
	
	
}
