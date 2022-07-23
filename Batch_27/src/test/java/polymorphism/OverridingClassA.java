package polymorphism;

public class OverridingClassA {

	protected void getProperty() {
		
	System.out.println("I am getting parents property by inherit");
	}
	
	protected void getCash() {
    	System.out.println("I am getting Grandparents cash by inherit");	
	}
    
	protected static void getWife(String name) {
	   
		System.out.println("his wife name " + name);
	   
	}
	
	public static void getAnything() {
		 System.out.println("Anything");
	 }
   
   
   
   
   
   public static void main(String[] args) {
	   OverridingClassA obj = new OverridingClassA();
	   obj.getProperty();
	   obj.getCash();
	   obj.getWife("Nasrin");
	   
}
	
	
	
}
