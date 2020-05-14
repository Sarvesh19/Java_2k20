package exectuter;

class wd {
	wd() {
		String[] str = { "sq", "wd", "fefd" };
		TestMainMethod.main(str);
	}
}

public class TestMainMethod {

	static int  count = 0;

	public static void main(String[] args) {
		count++;
		if(count != 10) {
			wd f = new wd();
			System.out.println("d2s");

		}

	}
}
