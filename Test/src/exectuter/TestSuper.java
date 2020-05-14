package exectuter;

class Bhakti_Building {
	Bhakti_Building(String st) {
		System.out.println(st + " Parent");
	}

//	Bhakti_Building() {
//
//	}
}

class Bhakti_Build_Wing extends Bhakti_Building {
	Bhakti_Build_Wing(String str) {
		super(str);
		System.out.println(str + " Child");
	}
}

public class TestSuper {
	public static void main(String[] args) {
		Bhakti_Building b = new Bhakti_Build_Wing("A-Wing");

	}

}
