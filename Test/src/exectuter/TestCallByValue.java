package exectuter;

class Foo_ {
	public String name = "sarvesh";
	int[] dz = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
}

public class TestCallByValue {
	public static void main(String[] args) {
		Foo_ f = new Foo_();
		Foo_ newFoo = getValue(f);

		System.out.println(newFoo == f);

		Foo_[] da = new Foo_[3];
		da[0] = new Foo_();
		Foo_ d = new Foo_();
		da[1] = d;
		d = null;
		da[1] = null;

	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("hv");
		super.finalize();
	}

	static Foo_ getValue(Foo_ fObj) {
		fObj.name = "parvesh";

		fObj = new Foo_();

		return fObj;
	}
}
