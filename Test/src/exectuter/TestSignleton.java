package exectuter;

public class TestSignleton {
	TestSignleton(){
		
	}
	
	public static void main(String[] args) {
		SabkaMalikEk obj1= SabkaMalikEk.getInstanceOfSabkaMalik();
		SabkaMalikEk obj2= SabkaMalikEk.getInstanceOfSabkaMalik();
		SabkaMalikEk obj3= SabkaMalikEk.getInstanceOfSabkaMalik();
		System.out.println(obj1 == obj2);

	}
}

class SabkaMalikEk {

	static SabkaMalikEk obj = null;

	private SabkaMalikEk() {

	}

	public static SabkaMalikEk getInstanceOfSabkaMalik() {
		if (obj == null) {
			obj = new SabkaMalikEk();
		}

		return obj;
	}

}
