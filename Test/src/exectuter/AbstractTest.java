package exectuter;

import java.util.HashMap;
import java.util.Map;

abstract class Animal {
//	private Animal() {
//		System.out.println("animal ... constructer");
//	}
	//void m13();
	 void m1() {
		System.out.println("m1");
	}
}


public class AbstractTest extends Animal{
	
//	void m1() {
//		System.out.println("wsqsq");
//	}
	
	static Animal v = new AbstractTest();
	
	
	public static void main(String... args) {
		
		v.m1();
		
		
		Map<String,String> mChild = new HashMap<>();
		
		
		Map<String, Map<String,String>> m = new HashMap<>();
		m.put("sarvesh",new HashMap<String,String>(){{put("sss","cwdw");} {put("sss","cwdw");}});
		m.put("sarvesh2",new HashMap<String,String>(){{put("sss","cwdw");}});
		m.put("sarvesh5",new HashMap<String,String>(){{put("1sss","cwdw");}});
		m.put("sarvesh8",new HashMap<String,String>(){{put("1sss","cwdw");}});
		
		System.out.println(m);

		
	}
	//v.
	
	//Animal n 
}
