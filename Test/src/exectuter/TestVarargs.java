package exectuter;

import java.io.IOException;

public class TestVarargs {
	
	void m1(String ...s) throws Exception{
		System.out.println("var args");
	}
	void m1(String s) throws NullPointerException{
		System.out.println("one  args");

	}
	
	void m1() {
		System.out.println("no args");
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		TestVarargs var = new TestVarargs();
		var.m1();
		var.m1("dw","dwwd","dwd");
		

	}
}
