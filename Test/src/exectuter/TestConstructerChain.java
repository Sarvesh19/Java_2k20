package exectuter;

class Papa {
	public String name;

//	Papa() {
//		System.out.println("default papa");
//	}
//	Papa(){
//		
//	}
	Papa(String name) {
		// this();
		System.out.println(name);
	}

	Papa(String name, String age) {
		// this(name);
		// this(checknum());
		// super();
		System.out.println(name + "Age : " + age);
	}

	static void checknum() {
		System.out.println("check num");
	}

}

class Beta_ extends Papa {
	public String name;

	Beta_(String name, String age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

}

public class TestConstructerChain {
	public static void main(String[] args) {
		int num = 4;
		Papa p = new Papa("sarvesh", "34");
		Beta_ b = new Beta_("sar,.,", "54");
		String n = b.name;
		String n1 = p.name;
		System.out.println(getAddedVal(num));
		
		
		// System.out.println(num);

	}
	static int getAddedVal(int i) {
		i = i+3; 
		return i;
	}
}
