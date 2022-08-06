package com.collections.partice;

public class JavaLoopingConcept {
	/*
	what is the loop?
	Ans: Loop is the one of the java option for increment, 
	decrement, counting, continue,and breaking those kind of operation
    by help of looping concept.
		
	How many types of loop in the java?
	Ans: There is many types of loops 
	     1.Basic loop (webElement)
	     2.Advance loop or enhance loop  (webElement)
	     3.While loop: Continues running (excel sheet), (dataBase handling)
	     4.Do-while loop
			
	*/
	
//Example: Basic loop
public void basicLoop() {

//There is three condition in basic loop	
//1. int i = 0; initialization
//2. i<num ; condition
//3. i++; (Increment) looping continues
	
	int num = 10;
	
	for(int i = 0; i < num ; i++) {
		
		System.out.println(i);
	}		
	
}


public void advanceLoop() {

	String [] names = {"smart" , "tech" , "batch", "27"};
	
	//There is three part
	
	//for is the formula 
	//newName is new variable
	//: names getting the values
	
	for(String newName : names) {
		
		System.out.println(newName);
	}
	
	
}


public void whileLoopPartice() {
	
	while(true) {
		System.out.println("My name is Rifat");
		
	}
	
}


	
	
	public static void main(String[] args) {
		JavaLoopingConcept abc = new JavaLoopingConcept();
		abc.whileLoopPartice();
		
	}
	
	
	
}
