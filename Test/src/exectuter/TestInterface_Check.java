package exectuter;

interface Ani {
	void eating();

	default void someEmergencyChange() {
		System.out.println("Some emergency changes");
	}

	public static final String name = "Ani";
	public static final String namedwd = "Anis";
	public static final String namwddwe = "dwdAni";
	public static final String namde = "dwAni";

}

abstract class RunningAni implements Ani{
	abstract void m1();
	
	@Override
	public void eating() {
		// TODO Auto-generated method stub

	}
}

public class TestInterface_Check extends  RunningAni {

	@Override
	public void eating() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}
}
