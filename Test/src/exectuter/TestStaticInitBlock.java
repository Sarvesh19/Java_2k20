package exectuter;

class Pill {
	static {
		System.out.println("static Pill");
	}
}

class Chill extends Pill {
	static {
		System.out.println("static Chill");
	}
}

public class TestStaticInitBlock extends Chill{
	
	TestStaticInitBlock(){
		main();
	}

	static {
		System.out.println("static 1");
	}

	{
		System.out.println("init block 1");
	}

	static {
		System.out.println("static 2");
	}
	{
		System.out.println("init block 2");

	}

	public static void main(String[] args) {
		TestStaticInitBlock block = new TestStaticInitBlock();
	}
	
	
	public static void main() {
		System.out.println("weew");
	}
}
