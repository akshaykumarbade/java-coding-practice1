package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<Integer> result = numbers.stream() // creates a stream of numbers list
								.filter(n->n%2==0) // filters the even numbers in the stream
								.map(n->n*2)// returns a stream where each element is doubled
								.collect(Collectors.toList()); // collect the elements of stream to result list.
		
		result.forEach(n->System.out.println(n)); // print each element of result list using foreach and lambda expression.

	}

}
