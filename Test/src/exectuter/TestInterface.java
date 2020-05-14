package exectuter;

interface Animal_int {
	String breed = "German_";

	default void m1() {

	}
	
	default void m2() {
		
		
	}
	
	default int m3() {
		return 1;
	}
	strictfp static void name() {
		System.out.println("wef");
	}
	

}

interface Animal_ {
	String breed = "German_";

	default void m1() {

	}
	
	default void m2() {
		
		
	}
	
	default int m3() {
		return 1;
	}
	strictfp static void name() {
		System.out.println("wef");
	}
	

}

abstract class Animal_abst {

	String breed = "Indian_";

	abstract void m1();

	void m2() {

	}

}

class Child1_ implements Animal_int{
	
//	private static void m33() {
//
//}
}

class Child2 extends Animal_abst {

	@Override
	void m1() {
		super.m2();
		// TODO Auto-generated method stub
		
	}

}

public  class TestInterface {

	public static void main(String[] args) {
		
		Child1_  a = new Child1_();
		a.m3();

	}

}

