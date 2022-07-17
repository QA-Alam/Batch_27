package encapsulation;
//class access modifier can't be private 
public class EncapsulationConcept { 

	//Need the access modifier as private 
	
	private String courseName = "Automation enginereer (SDET)";
	
	private int courseFee = 4000; // it is hiding 
	
	

//need to create the getter method to access the variable
	
	public String getCourseName() {
		return courseName;
	}

	public int getCourseFee() {
		return courseFee;
	} 
	
	
	public static void main(String[] args) {
		
		EncapsulationConcept obj = new EncapsulationConcept();
		System.out.println("My desgnation is "+obj.getCourseName());
		System.out.println("My course fee: "+obj.getCourseFee());
		
	}

	
	
}
