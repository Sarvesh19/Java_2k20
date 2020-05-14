package exectuter;

public class TestFinalize {
	public static void main(String[] args) {
		String s = new String("RR");
		s = null;
		TestFinalize t = new TestFinalize();
		t = null;
		
		byte b = 12;
		//byte b2 = b+7;
		
		float f = 23.444f;
		System.out.println((int)f);
		

		// Requesting JVM to call Garbage Collector method
		System.gc();
		System.out.println("Main Completes");
	}

	// Here overriding finalize method
	public void finalize() {
		System.out.println("finalize method overriden");
	}
}
