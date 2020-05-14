package com.collection;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMax {
	public static void main(String[] args) {
		Stream<Integer> strm = Stream.of(3, 54, 5, 9, 3, 4, 7, 3, 3, 4);
		Integer max = strm.max(Comparator.comparing(x -> x)).get();
		
		System.out.println(max);
		
		
		int [] arr = {3,4,2,56,76,22,44,222,44,98};
		int tempMax = 0;
		for (int i = 0; i < arr.length; i++) {
			tempMax = Math.max(tempMax, arr[i]);
		}
		System.out.println(tempMax);
		

	}
}
