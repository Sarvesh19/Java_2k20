package exectuter;

public class TestMixer {

	TestMixer() {

	}

	TestMixer(TestMixer t) {
		m1 = t;
	}

	TestMixer m1;

	public static void main(String[] args) {
		int i = 0;
		for (i = 0; i < 23; i++)
			;
		System.out.println(i);

		TestMixer m2 = new TestMixer();
		TestMixer m3 = new TestMixer(m2);
		m3.go();
		TestMixer m4 = m3.m1;
		m4.go();
		TestMixer m5 = m2.m1;
		m5.go();

	}

	void go() {
		System.out.println("hi...");
	}

}
