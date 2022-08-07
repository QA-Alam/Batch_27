package com.collections.partice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class ArrayListPartice {

// What is Array? 	
//Array length is fixed, Array is a faster, Array is non-SYNC, Array follow 
//the index theory, Array follow the insertion order. 

	public static void ArrayDisAdvantage() {
		String [] names = {"smart" , "tech" , "batch", "27","prodan vai"};
		
		int [] number = {10,200,30,400,50,60};
		
		for(int i = 0; i< number.length; i++ ) {
			
			System.out.println(number[7]);
			
		}
			
	}
	
	
public static void ArrayListDef() {
//how we declare the ArrayList?	
//ArrayList i
	
	List obj = new ArrayList();
	obj.add(10);
	obj.add("Smart");
	
	ArrayList obj1 = new ArrayList();
	
	List<Integer> number = new ArrayList<Integer>();
	number.add(10);
	//number.add("Smart"); wrong approach because of 
	//wrapper class
	
	List<String> names = new ArrayList<String>();
	//names.add(10); wrong approach because of wrapper class 
	
	
	names.add("Smart"); 
}


public static void printOutValueFromArrayList() {
	List<Integer> number = new ArrayList<Integer>();

	number.add(10); //0
	number.add(20); //1
	number.add(100);// 2
	number.add(150); //3 
	number.add(1100); //4
	number.add(null);
	number.add(null);
	number.add(null);
	number.add(null);
	number.add(null);
	
for(int i =0; i<number.size();i++) {
	//System.out.println(number[i]); Wrong Approach!
	
	System.out.println(number.get(i));
}
	
	
	
}

//How to find out the max number and the min number?
public static void findOutTheMaxMinNumber() {
	List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,100,300,1000));
	
	List<Integer> number = new ArrayList<Integer>();
	number.add(10); //0
	number.add(20); //1
	number.add(2000);// 2
	number.add(150); //3 
	number.add(1100); //4
	
	int max = Collections.max(number);
	System.out.println("This is the max number: "+max);
	
	int min = Collections.min(number);
	System.out.println("This is the min number: "+min);
	
}



//How to remove the duplicate number? 
//First of all I have the instilizied values with the ArrayList then 
//I have to use call stream api method help of the ArrayList variable then 
//variable.stream().distinct().collect(Collectors.toList()) and then
// need to store the values in list reference variable.

public static void removeTheDuplicateNumber() {
	
List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,100,300,300,1000));


List<Integer> duplicate= numbers.stream().distinct().collect(Collectors.toList());

System.out.println(duplicate);
	
	
	
}

//How to sort the values? 
public static void sortTheValue() {
	List<String> names = new ArrayList<>();
	names.add("Marzia");
	names.add("Warisha");
	names.add("Anamika");
	names.add("Forida rouf");
	names.add("Mousoumi dey");
	names.add("Akifa");
	names.add("Dilruba");
	names.add("Fatema");
	names.add("More");
	
	Collections.sort(names);
	
for(String newName :names) {
	System.out.println(newName);
}
	
}


//How to split the values from the string?
//by using split method and store them in to the String array then print out with the loop
public static void splitTheValue() {

	String country = "United States Of America";
	
	String[]words = country.split(" ",3);
	
	for(String newWord: words ) {
		System.out.println(newWord);
	}
	
}


//What is the difference between ArrayList and the vector? 
public static void vectorTest() {
//Vector is SYNC,
//ArrayList is non-SYNC
//When we add the value in the vector increase the size 100 percent.
//ArrayList increase the size 50 percent.
	Vector<Integer>obj = new Vector<>();
	obj.add(100);
	obj.add(500);
	obj.add(400);
	obj.add(900);
	obj.add(200);
	obj.add(500);
	
	
}

public static void LinkedListTest() {

//linkedList followed the linked theory, does not maintain the order, it is sync
//Null-> marzia -> Warshia -> Anamika -> Farida rouf-> Null
	
	
	LinkedList<String> names = new LinkedList<>();
	names.add(null);
	names.add("marzia");
	names.add("Warshia");
	names.add("Anamika");
	names.add("Farida rouf");
	names.add(null);
	
	
}




	
	public static void main(String[] args) {
		ArrayListPartice.printOutValueFromArrayList();
	}
	
	
}
