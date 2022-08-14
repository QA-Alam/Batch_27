package com.collections.partice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPartice {
//Map 
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Forida Apu");
		map.put(1, "Forida Apu");
		map.put(2, "Marzia Apu");
		map.put(3, "Worisha Apu");
		map.put(4, "Anamika Apu");
		map.put(5, "Mosumi Apu");
		map.put(6, "Diruba Apu");
		map.put(7, "Mosumi Apu");
		map.put(8, null);
		map.put(null, null);
		map.put(null, null);
		map.put(9, null);
		
		for(Entry <Integer, String> info : map.entrySet()) {
			
			System.out.println(info.getKey() +" "+ info.getValue());
			
		}
		
		
	}
	
	
	
}
