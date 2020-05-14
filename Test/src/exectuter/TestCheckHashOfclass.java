package exectuter;

public class TestCheckHashOfclass {
	private String str = "sarvesh";

	public static void main(String[] args) throws Throwable {
		TestCheckHashOfclass c1 = new TestCheckHashOfclass();

		TestCheckHashOfclass c2 = new TestCheckHashOfclass();
		TestCheckHashOfclass c3 = new TestCheckHashOfclass();
		TestCheckHashOfclass c4 = new TestCheckHashOfclass();

		System.out.println(c1 == c2);
		int x = 2, y = 3;
		if ((y == x++) && (x < ++y)) {
			
			System.out.println("x = " + x + "  y = " + y);
		} else {
			System.out.println("else");
		}

		int i = 2 ;
		
		final int i1 = 3 ;
		final int i2  = 2;
		//i2 = 3;
		
		
		switch(i2) {
		case i1 : System.out.println("dwed"); 
		
		default : System.out.println("default");
		
		case i2 : System.out.println("case 5");
		
		
		}
		
		
		
		c1.finalize();

	}
}
