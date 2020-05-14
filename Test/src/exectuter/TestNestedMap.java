package exectuter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestNestedMap {
	
	void m1() {
		System.out.println("dwd");
	}
	
	
	abstract class deck extends TestNestedMap{
		 abstract void m1();
	}
	
public static void main(String[] args) {
			Set s =new HashSet<>();
		
		Map<Float, Map<Float, Integer>> map = new HashMap<>();

		map.put(.0F, new HashMap(){{put(.0F,0); put(.0F,0);put(4.0F,0);put(6.0F,0);put(8.0F,0);}});
		map.put(.1F, new HashMap(){{put(.1F,1);}});
		
		System.out.println(map);
		
		
//		HashMap<String, HashMap<String, String>> nestedMap = new HashMap<>();
//		nestedMap.put("sarvesh", new HashMap<String, String>().put("dwd", "edwfc"));
//		nestedMap.put("sarvesh", new HashMap<String, String>().put("dwd", "edwfc"));
//		nestedMap.put("sarvesh", new HashMap<String, String>().put("dwd", "edwfc"));
//		nestedMap.put("sarvesh", new HashMap<String, String>().put("dwd", "edwfc"));
		
		
		String s1 = null;
		System.out.println(s1);
		
		String s2 = "";
		System.out.println(s2);
		
		
		

		

	}
}
