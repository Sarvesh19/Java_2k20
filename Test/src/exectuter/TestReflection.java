package exectuter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test {
	// creating a private field
	private String s;

	// creating a public constructor
	public Test() {
		s = "GeeksforGeeks";
	}

	// Creating a public method with no arguments
	public void method1() {
		System.out.println("The string is " + s);
	}

	// Creating a public method with int as argument
	public void method2(int n) {
		System.out.println("The number is " + n);
	}

	// creating a private method
	private void method3() {
		System.out.println("Private method invoked");
	}
}

public class TestReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Test obj = new Test();
		Class cls = obj.getClass();
		Method[] method = cls.getMethods();
		
		
		for (Method meth : method) {
			System.out.println(meth.getName());
		}
		

		Method method3 = cls.getDeclaredMethod("method3");
		
		method3.setAccessible(true); 

		method3.invoke(obj); 
		
		//cls.get

		

		
	}

}
