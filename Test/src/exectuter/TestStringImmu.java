package exectuter;

public class TestStringImmu {
	public static void main(String[] args) {
		String str = "sarvesh";
		str = str.concat(" yadav");
		System.out.println("");
		String strrr = null;
		String t = null;
		if(t == "null") {
			System.out.println("xrrrex");	

		}
		if(t== null) {
		System.out.println("xex");	
		} 
		
		String ku = strrr +" "+t;
		String [] split = ku.split(" ");
		StringBuffer st = new StringBuffer();
		StringBuilder st1 = new StringBuilder();
		//st = st.append(" Yadav");
		st1.append("eex ");
		System.out.println(st1.append(strrr));
	}
}
