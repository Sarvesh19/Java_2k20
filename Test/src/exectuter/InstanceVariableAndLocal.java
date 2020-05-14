package exectuter;
class Chilla {
	
	Chilla(final int str){
		// str++; not possible
		System.out.println(str +" " +"qsqsq");
	}
	
	
}
public class InstanceVariableAndLocal {
	
	private String name;
	
	public static void main(String[] args) {
		String nameLocal = null;
		
		
		InstanceVariableAndLocal n = new InstanceVariableAndLocal();
		System.out.println(n.name + " " +nameLocal);
		
		Chilla c = new Chilla(3);
		
		
	}
	
	
	

}
