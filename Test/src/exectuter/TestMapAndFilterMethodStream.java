package exectuter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMapAndFilterMethodStream {

	public static void main(String[] args) {

		
		List<Integer> number = Arrays.asList(2,3,4,5);
		number.stream().map(x->x*x);
		
		System.out.println(number);
		
		Map<String, Integer> mx = new HashMap<>();
		mx.put("srvesh",3);
		mx.put("4rvesh",5);
		mx.put("5rvesh",3);
		mx.put("frvesh",43);
		mx.put("wrvesh",1);
		
		mx.entrySet().stream().filter(k -> k.getValue() > 1).map(x -> x.getValue()).forEach(k -> {
			//System.out.println(k.getKey() + " " +k.getValue());
			System.out.println(k);
		});
		
		mx.forEach((k,v) -> System.out.println(k + " " + v));
		

		
	}

}
