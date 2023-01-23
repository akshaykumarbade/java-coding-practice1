package com.practice;

import java.util.ArrayList;

public class GenericVsNonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arr1 = new ArrayList();
		
		arr1.add("Sachin");
		arr1.add("Nina");
		arr1.add(5);
		
		for (Object object : arr1) {
			System.out.println(object);
		}
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Nina");
		arr2.add("Hazal");
		//arr2.add(10);
		arr2.add("Komal");
		
		arr2.forEach(name->{
			System.out.println(name);
		});

	}

}
