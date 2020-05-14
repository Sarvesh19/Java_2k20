package exectuter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class TestInstanceOf {

	public static void main(String[] args) {
		
		
		
		String[] words = new String[10]; 
		
		words[4] = "sarvesh";
		words[5] = "sa";
        Optional<String> checkNull =  
                      Optional.of(words[4]);  
        
        checkNull.filter(r -> {
        	
        	
        	return r.equals("sa");
        	
        });
        
        if(checkNull.isPresent())
        	System.out.println("present" + checkNull);
        
        

		Object o = new Hosting(2, "", 2);

		if (o instanceof Hosting) {
			System.out.println("Yes... Object is instanceof Hosting");
		}

		Set<Integer> set = new HashSet<>();

		set.add(23);
		System.out.println(set.add(32));
		set.add(34);
		System.out.println(set.add(32));

		System.out.println(set);
		
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("Dess", 3);
		map.put("xxDess", 4);
		map.put("wdwDess", 3);
		
		System.out.println(map.put("vfvDess", 3));

		map.put("dd", 8);
		map.put("ddDwess", 6);
		
		System.out.println(map.put("vfvDess", 3));


		// TODO Auto-generated method stub

	}

}
