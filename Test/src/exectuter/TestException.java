package exectuter;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestException {
	public static void main(String[] args)  {
		
		
		try {
			m1();
			
		} 
		
//		catch(Exception e){
//			  If add then alredy handled compile error
//		} 
		
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("hello +++++");

		} catch(Exception e) {
			
		}
		
		System.out.println("wiebduwed");

	}
	
	
	static void m1() throws FileNotFoundException {
		System.out.println("wcwec");
		
		
		FileReader file = new FileReader("somefile.txt");

		
	}
}
