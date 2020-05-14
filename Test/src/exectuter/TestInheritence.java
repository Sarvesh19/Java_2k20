package exectuter;

import exectuter.Parent.SubParent;

class Parent {
	private int legs;

	private String bread;
	private String name;

	class SubParent {

		public SubParent() {
			System.out.println("Sub parent constructore");

		}

	}

	Parent() {
		System.out.println("parent constructor");
	}

	void eating() {
		bread = "labra";

		System.out.println("Parent eating style " + (9 + 8));
	}

	void running() {
		bread = "labra";

		System.out.println("Parent running style " + (9 + 9));
	}

}

class Child extends Parent {

	class SubChild {

		SubChild() {

			System.out.println("sub child constructore");
		}

	}

	Child() {

		// super();
		// super.eating();
		// super.running();

		System.out.println("Child constructor");
	}

	void running() {
		super.running();
		System.out.println("child running style");
	}

}

public class TestInheritence {

	public static void main(String[] args) {
		Child p = new Child();
		p.eating();
		p.running();
		Parent par = new Parent();

		Parent.SubParent sub = new Parent().new SubParent();

	}
}
