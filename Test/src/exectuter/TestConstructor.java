package exectuter;

class JP {
	String name;

//	JP() {
//		this("JP Yadav");
//		System.out.println("default constuctor");
//
//	}

	JP(String name) {
		super();
		this.name = name;
	}
}

class Sarvesh extends JP {
	Sarvesh(String i) {
		super(i);
		TestConstructor.meme();
		//super("dwjd"); wont work
	}
}

public class TestConstructor {

	public static void main(String[] args) {
		JP jp = new Sarvesh("ed");
		System.out.println(jp.name);
	}
	public static void meme() {
		System.out.println("meme");
	}
}
