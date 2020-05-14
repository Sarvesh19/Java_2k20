package exectuter;

import java.util.LinkedList;

class Parent_1 {
	String name = "";

	public Parent_1(String s) {
		this.name = s +" das";
	}
	

	 void m1() throws Exception {
		System.out.println("m1 in parent method");
	}
}

class Child_1 extends Parent_1 {
	String name = "das111";

	Child_1(String s) {
		super(s); // either add default constructer in parent or add super parametreized const cal   from child
	}
// private is not acceptable because we have 
	 void m1() throws Exception{
		// super.m1();  ok !!!
		System.out.println("m1 in child method");
	}
	 
	 void m2() {
		 
	 }
}

class _ {
	public  void main() {
		System.out.println("sws");
	}
}

public class TestInheritance {
	static Parent_1 p = new Child_1("Rupesh");

	public static void main(String[] args) throws Exception {
		
		LinkedList<String> linkedList = new LinkedList<>();
		//linkedList.
		//Object

		p.m1();
		System.out.println(p.name);
		
		
		
		_ n = new _();
		n.main();
	}

}
