package exectuter;

enum CoffeeSize {
	// 8, 10 & 16 are passed to the constructor
	BIG(8), HUGE(10), OVERWHELMING(16);

	CoffeeSize(int ounces) { // constructor
		this.ounces = ounces;
	}

	private int ounces; // an instance variable

	public int getOunces() {

		return ounces;
	}
}

class Coffee {
	CoffeeSize size; // each instance of Coffee has an enum

	public static void main() {
		Coffee drink1 = new Coffee();
		drink1.size = CoffeeSize.BIG;
		Coffee drink2 = new Coffee();
		drink2.size = CoffeeSize.OVERWHELMING;
		System.out.println(drink1.size.getOunces()); // prints 8
		for (CoffeeSize cs : CoffeeSize.values())
			System.out.println(cs + " " + cs.getOunces());
	}
}

class CG {
	void policy(String... s) {
		System.out.println("s Cg " + s);
	}
}

class Sogeti extends CG {
	void policy(String[] s) {
		System.out.println("s in sogeti " + s);
	}
}

public class TestVarargsSuper {
	public static void main(String[] args) {
		CG cg = new Sogeti();
		cg.policy();
		Coffee.main();
	}
}
