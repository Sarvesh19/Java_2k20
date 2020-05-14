package exectuter;

public class TestLocalVar {

	private static Hosting host;

	static {
		host = new Hosting(2, "sarvehhh", 3);
	}

	public static void main(String[] args) {

		Hosting temp = host;

		temp.setName("parvesh");

		System.out.println(host);

	}
}
