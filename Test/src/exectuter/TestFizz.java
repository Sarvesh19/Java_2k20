package exectuter;

public class TestFizz {
	int x = 5;

	public static void main(String[] args) {
		final TestFizz f1 = new TestFizz();
		TestFizz f2 = new TestFizz();
		TestFizz f3 = FizzSwitch(f1, f2);
		System.out.println((f1 == f3) + " " + (f1.x == f3.x));
	}

	static TestFizz FizzSwitch(final TestFizz x, TestFizz y) {
		final TestFizz z = x;
		z.x = 6;
		return z;
	}
}
