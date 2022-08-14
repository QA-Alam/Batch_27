package com.collections.partice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPartice {

//Map is an interface which implements many classes
//example HashMap, LinkedHashMap, TreeMap and more

//Map store data by key and values pair 
//Map key will be unique and only one null key.
//Map value could be duplicate and as many as null values
//we get the value by the index
	
//for printing the map we need use inside the loop instead of data type
// we have to use the entry class  and help of the map instance
// we can call the entrySet() method

//Print out the key by instance then getKey() Method
//Print out the value by instance then getValue() Method

	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Forida  Apu");
		map.put(1, "Forida  Apu");
		map.put(2, "Marzia  Apu");
		map.put(3, "Worisha Apu");
		map.put(4, "Anamika Apu");
		map.put(5, "Mosumi  Apu");
		map.put(6, "Diruba  Apu");
		map.put(7, "Mosumi  Apu");
		map.put(8, null);
		map.put(null, null);
		map.put(null, null);
		map.put(9, null);
		
		for(Entry <Integer, String> info : map.entrySet()) {
			System.out.println(info.getKey() +" "+ info.getValue());
			
		}
		
		
	}
	
	
	
}
