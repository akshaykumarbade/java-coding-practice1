package com.practice;
import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		
		l.add("Nina");
		l.add("Monica");
		l.add("Joey");
		l.add("Chandler");
		l.add("Ross");
		
		System.out.println(l);
		
		List<String> streamList = l.stream()
									.sorted(Comparator.reverseOrder())
									.collect(Collectors.toList());
		
		streamList.forEach(System.out::println);
	}

}

