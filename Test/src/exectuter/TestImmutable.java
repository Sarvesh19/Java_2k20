package exectuter;

public class TestImmutable {
	public static void main(String[] args) {
		String a="stack";
		System.out.println(a);//prints stack
		a.concat("overflow");
		System.out.println(a);
	}
}
