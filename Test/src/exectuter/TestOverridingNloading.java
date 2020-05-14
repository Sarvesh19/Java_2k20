package exectuter;

import java.io.IOException;

class Vehicle {

	 void starting() throws Exception { // private final ok but not only final
		System.out.println("starting...vehicle");
	}
	
	void starting(String s) {
		System.out.println("starting...vehicle "+ s);
	}
	
	void cucku() throws Exception {
		System.out.println("starting...cucku");
	}

}

class Car_ extends Vehicle {
	  void starting() {  // cant be broad
		System.out.println("stating... car");
	}
	
	void starting(String s) {  // cant be broad
		System.out.println("stating... car " + s);
	}
}

public class TestOverridingNloading {
	public static void main(final String... args) throws Exception {
		Vehicle v = new Car_();
		v.starting();
		v.cucku();
		Car_ c = new Car_();
		Vehicle v1 = new Vehicle();
		c.starting();
		v.starting("sarvesh");
		
		c.starting("sarvesh");
		v1.starting("kv");

	}
}
