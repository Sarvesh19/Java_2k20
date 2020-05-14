package exectuter;

class ITCompanies {
	static String s = " ";

	
	public ITCompanies() {
	}
	

}

class Apple extends ITCompanies {

}

class ApplePRoduct extends Apple {

}

public class TestConstructore extends ApplePRoduct {

	private TestConstructore() {
		s += "Test Const"; 
	}

	public static void main(String[] args) {
		TestConstructore ap = new TestConstructore();

	}
}
