package exectuter;

class dejay{
	void mr() {
		
	}
}

abstract class njj extends dejay{
	abstract void mr();
}
public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Hosting h = new Hosting(2, "sarvesh", 90l);
		Hosting h1 = null;
		if (h instanceof Hosting)
			h1 = (Hosting) h.clone();

		//h1.setName("Parvesh");
		System.out.println(h1.hashCode());
		System.out.println(h.hashCode());
		System.out.println(h1 == h);
		System.out.println(h1.equals(h));
		
		
		

	}
}
