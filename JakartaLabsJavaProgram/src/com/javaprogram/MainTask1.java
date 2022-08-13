package com.javaprogram;

import java.util.TreeMap;
import java.util.TreeSet;

public class MainTask1 {

	
	//This main class for Task 1
	//objective :
	//create sample of Treemap + Treeset with minumum 3 members.
	
	
	public static void main(String[] args) {
		
		TreeSet<String> memberNames = new TreeSet<>();
		
		memberNames.add("Robi");
		memberNames.add("Andin");
		memberNames.add("Lia");
		memberNames.add("Silvi");
		memberNames.add("Gusti");
		
		System.out.println("This is the result sample of Treeset implementation");
		System.out.println("---------------------------------------------------");
		
		for (String item : memberNames) {
			System.out.println(item);
		}
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("This is the result sample of Treemap implementation");
		System.out.println("---------------------------------------------------");
		
		
		TreeMap<Integer, String> favoriteNumber = new TreeMap<>();
		
		favoriteNumber.put(9, "Robi");
		favoriteNumber.put(10, "Herdian");
		favoriteNumber.put(5, "Andin");
		favoriteNumber.put(26, "Lia");
		favoriteNumber.put(27, "Silvi");
		
		//sorting by values
		System.out.println("sorting by values");
		for (String item : favoriteNumber.values()) {
			System.out.println(item);
		}
		
		System.out.println();
		
		//sorting by key
		System.out.println("sorting by key");
		for (Integer item : favoriteNumber.keySet()) {
			System.out.println(item + " is " + favoriteNumber.get(item));
		}
	}

}
