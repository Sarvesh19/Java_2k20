package exectuter;

public class TestReturn {

	TestReturn() {
		String str[] = { "sarvesh", "edd" };
	}

	void m1() {
		System.out.println("wcc");
		return;
	}

	static int num = 0;

	public static void main(String[] args) {
		num++;
		TestReturn t = new TestReturn();
		System.out.println(t);
		if (num == 10) {
			return;
		}

		print();
	}

	static void print() {
		String str[] = { "sarvesh", "edd" };

		main(str);

		System.out.println();
	}
}
