package exectuter;

import java.util.function.Predicate;

class Beta {

}

class Alpha {
	static Beta b1;
	Beta b2;

}

public class TestCheckGC {
	public static void main(String[] args) {

		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		Beta b1 = new Beta();
		Beta b2 = new Beta();
		a1.b1 = b1;
		a1.b2 = b1;
		a2.b2 = b2;

		a1 = null;
		b1 = null;
		b2 = null;
		System.out.println("dd");
		int i [] = new int[5];
		//System.out.println(i[5]);
		System.out.println(i);
		Predicate<String> p;
		
		int [] [] d2 = {{3,4,5},{4,2,1}};
		int [] d1 = d2[1];
		Object o = d2;
		//p.test();
		
		StringBuilder sb = new StringBuilder("abc");
		StringBuilder sb1 = sb;
		sb1.append(" Sarvesh");
		System.out.println(sb ==sb1);
		
		Hosting h1 = new Hosting(3, "sarvesh", 4l);
		Hosting h2 = h1;
		h1.setName("Parvesh");
		h2.setName("koiii");
		
		System.out.println(h1 == h2);

		
		
		

		
		
//		p.te

	}
}
