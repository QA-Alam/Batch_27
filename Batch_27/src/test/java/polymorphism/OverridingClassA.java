package polymorphism;

public class OverridingClassA {

	public void getProperty() {
		
	System.out.println("I am getting parents property by inherit");
	}
	
    public void getCash() {
    	System.out.println("I am getting Grandparents cash by inherit");	
	}
    
   public void getWife(String name) {
	   
		System.out.println("his wife name " + name);
	   
	}
   
   
   
   
   
   public static void main(String[] args) {
	   OverridingClassA obj = new OverridingClassA();
	   obj.getProperty();
	   obj.getCash();
	   obj.getWife("Nasrin");
	   
}
	
	
	
}
