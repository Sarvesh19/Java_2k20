package exectuter;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestDuplicateRemove {

	static int removeDuplicates(int arr[], int n) {
		if (n == 0 || n == 1)
			return n;

		// To store index of next unique element
		int j = 0;

		// Doing same as done in Method 1
		// Just maintaining another updated index i.e. j
		for (int i = 0; i < n - 1; i++)
			if (arr[i] != arr[i + 1])
				arr[j++] = arr[i];

		arr[j++] = arr[n - 1];
		TreeMap<String,Integer> tree = new TreeMap<>();
		
		
		
		Map<String, Integer> map  = new LinkedHashMap<>();
		map.put("s", 34);
		map.put("dwds", 34);
		map.put("rrfs", 6354);

		map.put("ffs", 344);

		map.put("yys", 734);
		String arrA [] = {"cwe","wef","wfwf","ttt"};
		int arrInt[] = {3,43,4,5,4,6,5,6,7};
		List<Integer> stL = IntStream.of(arrInt).boxed().collect(Collectors.toList());

		
		
		
		String[] words = new String[10];   
       String checkNull =  null;
         //             Optional.ofNullable(words[5]).get(); 
        System.out.println(Optional.ofNullable(checkNull).isPresent());
        
        ConcurrentHashMap<String, String> concu = new ConcurrentHashMap();
		concu.put("cqec", "wfw");
		concu.put("wewe", "efe");
//Collections.synchronizedSortedMap(concu);
		List<String> st = Stream.of(arrA).collect(Collectors.toList());
		System.err.println(st);
		List<String> list = map.entrySet().stream().map(k -> k.getKey()).collect(Collectors.toList());
		System.out.println(list);
		//list.
		
		//
		
//		forEach(x -> {
//		System.out.println(x);
//		})
//		;
		
		

		//Stream

		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int n = arr.length;

		n = removeDuplicates(arr, n);

		// Print updated array
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
