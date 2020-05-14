package exectuter;

interface I1 {
	default String m1() {
		return "Default of I1";
	}
}

interface I2 {
	public default String m1() {
		return "Default of I2";
	}
}

public class TestDefaultMethod implements I1, I2 {

	//@Override
	
	public static void main(String[] args) {
		System.out.println(new TestDefaultMethod().m1());

		// System.out.println(new TestDefaultMethod());
	}

	@Override
	public String m1() {
		// TODO Auto-generated method stub
		return I1.super.m1();
	}

}
